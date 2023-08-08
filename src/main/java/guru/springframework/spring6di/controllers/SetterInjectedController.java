package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {


    private GreetingService greetingService;
    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService( GreetingService greetingService) {
        System.out.println("SetterInjectionController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
