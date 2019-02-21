package falcon.spring5.didemo.controller;

import falcon.spring5.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testInscription() throws Exception {
        assertEquals(GreetingServiceImpl.INSCRIPTION, propertyInjectedController.getText());
    }
}
