package falcon.spring5.didemo.Repository;

import org.springframework.stereotype.Repository;

/**
 * Created by jt on 5/24/17.
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "I'm a primary Service!";
    }

    @Override
    public String getSpanishGreeting() {
        return "¡Soy un servicio primario!";
    }

    @Override
    public String getPolishGreeting() {

        return "Jestem 'primary' serwisem !";

    }
}
