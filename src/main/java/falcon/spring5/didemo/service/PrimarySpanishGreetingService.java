package falcon.spring5.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile({"es", "default"})
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String getInscription() {
        return "¡Soy un servicio primario!";
    }
}
