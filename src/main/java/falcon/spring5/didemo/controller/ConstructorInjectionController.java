package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    /**
     * Qualifier with a bean name
     */
    public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getText(){
        return greetingService.getInscription();
    }
}
