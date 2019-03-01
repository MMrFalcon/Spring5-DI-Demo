package falcon.spring5.didemo.configuration;

import falcon.spring5.didemo.examplebeans.DefaultPropetiesData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultPropertiesConfig {

    @Value("${falcon.example.name}")
    String name;

    @Value("${falcon.example.email}")
    String email;

    @Bean
    public DefaultPropetiesData defaultPropetiesData(){
        DefaultPropetiesData defaultPropetiesData = new DefaultPropetiesData();
        defaultPropetiesData.setName(this.name);
        defaultPropetiesData.setEmail(this.email);

        return defaultPropetiesData;
    }
}
