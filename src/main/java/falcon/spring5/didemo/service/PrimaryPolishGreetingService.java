package falcon.spring5.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("pl")
public class PrimaryPolishGreetingService implements GreetingService {
    @Override
    public String getInscription() {
        return "Jestem 'primary' serwisem !";
    }
}
