package falcon.spring5.didemo.configuration;

import falcon.spring5.didemo.examplebeans.Datasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Creation of Beans for Datasource
 */

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    private final Environment environment;

    @Value("${falcon.databaseName}")
    String databaseName;

    @Value("${falcon.dbUrl}")
    String dbUrl;

    @Value("${falcon.userName}")
    String userName;

    @Value("${falcon.password}")
    String password;

    @Autowired
    public PropertyConfig(Environment environment) {
        this.environment = environment;
    }

    /**
     * Allows to wire up by 'value'
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

    /**
     * Setting up properties in Datasource Bean
     */
    @Bean
    Datasource datasource() {
        Datasource datasource = new Datasource();
        datasource.setDatabaseName(this.databaseName);
        datasource.setDbUrl(this.dbUrl);
        datasource.setUserName(this.userName);
        datasource.setPassword(environment.getProperty("PASSWORD"));

        return  datasource;
    }
}
