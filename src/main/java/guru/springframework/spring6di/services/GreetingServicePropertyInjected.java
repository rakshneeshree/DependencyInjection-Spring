package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingServicePropertyInjected")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends dont let friend do Property Injection";
    }
}
