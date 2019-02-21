package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testInscription() throws Exception {
        assertEquals(GreetingServiceImpl.INSCRIPTION,  constructorInjectionController.getText());
    }
}
