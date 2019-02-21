package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * BAD PRACTICE !
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingServiceImpl;

    public String getText(){
        return greetingServiceImpl.getInscription();
    }
}
