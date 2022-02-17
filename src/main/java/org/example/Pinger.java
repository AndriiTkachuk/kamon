package org.example;

import akka.actor.AbstractActor;

import javax.websocket.PongMessage;

class Pinger extends AbstractActor {

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(PongMessage.class, this::onReceive).build();
    }

    static final class PingMessage {
    }

    public void onReceive(Object message) throws Exception {
        if (message instanceof Ponger.PongMessage) getSender().tell(new PingMessage(), getSelf());
        else unhandled(message);
    }
}