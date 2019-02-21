package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Better practice than property injection.
 * Service was used.
 */
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    String getText(){
        return greetingService.getInscription();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
