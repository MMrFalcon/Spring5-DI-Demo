package falcon.spring5.didemo.configuration;

import falcon.spring5.didemo.examplebeans.YmlDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Application doesn't have to have '@PropertySource' annotation
 * if .property file starts with 'application'
 */
@Configuration
public class YmlPropertyConfig {

    @Value("${falcon.example.key}")
    String key;

    @Value("${falcon.example.value}")
    String value;

    @Bean
    public YmlDatasource ymlDatasource() {
        YmlDatasource ymlDatasource = new YmlDatasource();
        ymlDatasource.setKey(this.key);
        ymlDatasource.setValue(this.value);

        return ymlDatasource;
    }
}
