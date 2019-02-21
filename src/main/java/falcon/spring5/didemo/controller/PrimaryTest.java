package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryTest {

    private GreetingService greetingService;

   public PrimaryTest(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getInscription() {
        System.out.println("Inscription");

        return greetingService.getInscription();
    }
}
