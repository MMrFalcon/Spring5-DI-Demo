package falcon.spring5.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    public String getInscription() {
        System.out.println("Inscription");

        return "Some text";
    }
}
