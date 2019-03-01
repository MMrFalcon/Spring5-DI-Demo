package falcon.spring5.didemo;

import falcon.spring5.didemo.controller.ConstructorInjectionController;
import falcon.spring5.didemo.controller.PrimaryTest;
import falcon.spring5.didemo.controller.PropertyInjectedController;
import falcon.spring5.didemo.controller.SetterInjectionController;
import falcon.spring5.didemo.examplebeans.Datasource;
import falcon.spring5.didemo.examplebeans.DefaultPropetiesData;
import falcon.spring5.didemo.examplebeans.YmlDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        /**
         * With @Controller - class TestController  has created Bean named 'testController'
         */
        PrimaryTest controller = (PrimaryTest) applicationContext.getBean("primaryTest");

        System.out.println("\n***** Injecting  - DEMO *****\n");
        System.out.println(controller.getInscription());
        System.out.println(applicationContext.getBean(PropertyInjectedController.class).getText());
        System.out.println(applicationContext.getBean(SetterInjectionController.class).getText());
        System.out.println(applicationContext.getBean(ConstructorInjectionController.class).getText());

        System.out.println("\n***** External Properties - DEMO ***** \n");

        Datasource datasource = applicationContext.getBean(Datasource.class);

        System.out.println(datasource.getDatabaseName());
        System.out.println(datasource.getDbUrl());
        System.out.println(datasource.getUserName());
        System.out.println(datasource.getPassword());

        YmlDatasource ymlDatasource = applicationContext.getBean(YmlDatasource.class);

        System.out.println("\n***** Yml Properties *****\n");
        System.out.println(ymlDatasource.getKey());
        System.out.println(ymlDatasource.getValue());

        DefaultPropetiesData defaultPropetiesData = applicationContext.getBean(DefaultPropetiesData.class);

        System.out.println("\n***** Default properties from application.properties - working with profiles *****\n");

        System.out.println("Jacob overridden by application-pl.properties file = " + defaultPropetiesData.getName());
        System.out.println(defaultPropetiesData.getEmail());
    }

}
