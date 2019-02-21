package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Better practice than property injection.
 * Service was used.
 */
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    public String getText(){
        return greetingService.getInscription();
    }

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
