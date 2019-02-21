package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testInscription() throws Exception {
       assertEquals(setterInjectionController.getText(), GreetingServiceImpl.INSCRIPTION);
    }
}
