package falcon.spring5.didemo.service;

import falcon.spring5.didemo.Repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class PrimarySpanishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String getInscription() {
        return greetingRepository.getSpanishGreeting();
    }
}
