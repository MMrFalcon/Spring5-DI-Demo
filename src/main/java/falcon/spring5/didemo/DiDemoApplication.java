package falcon.spring5.didemo;

import falcon.spring5.didemo.controller.ConstructorInjectionController;
import falcon.spring5.didemo.controller.PropertyInjectedController;
import falcon.spring5.didemo.controller.SetterInjectionController;
import falcon.spring5.didemo.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        /**
         * With @Controller class TestController  has created Bean named 'testController'
         */
        TestController controller = (TestController) applicationContext.getBean("testController");

        controller.getInscription();

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).getText());
        System.out.println(applicationContext.getBean(SetterInjectionController.class).getText());
        System.out.println(applicationContext.getBean(ConstructorInjectionController.class).getText());
    }

}
