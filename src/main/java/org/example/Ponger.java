package org.example;

import akka.actor.AbstractActor;

class Ponger extends AbstractActor {

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Pinger.PingMessage.class, this::onReceive).build();
    }

    static final class PongMessage {
    }

    public void onReceive(Object message) throws Exception {
        if (message instanceof Pinger.PingMessage) getSender().tell(new PongMessage(), getSelf());
        else unhandled(message);
    }
}
