package falcon.spring5.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String getInscription() {
        return "Im a primary Service!";
    }
}
