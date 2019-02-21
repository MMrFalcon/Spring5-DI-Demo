package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * BAD PRACTICE !
 */
@Controller
public class PropertyInjectedController {
    public GreetingServiceImpl greetingServiceImpl;

    String getText(){
        return greetingServiceImpl.getInscription();
    }
}
