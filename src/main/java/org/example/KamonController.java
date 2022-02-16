package org.example;

//import kamon.annotation.Count;
//import kamon.annotation.EnableKamon;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/kamon")
//@EnableKamon
public class KamonController {

    @RequestMapping("/counter")
    @ResponseBody
    //@Count(name = "awesomeCounter")
    public String counter() {  return "count!!!"; }
}