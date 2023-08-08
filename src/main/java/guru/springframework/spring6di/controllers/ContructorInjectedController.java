package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ContructorInjectedController {
    private final GreetingService greetingService;


    //to print from primary greeting service
   // public ContructorInjectedController(GreetingService greetingService) {

    //to print from original service
    public ContructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
