package falcon.spring5.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String getInscription() {
        return "Inscription injected from setter";
    }
}
