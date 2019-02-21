package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String getText(){
        return greetingService.getInscription();
    }
}
