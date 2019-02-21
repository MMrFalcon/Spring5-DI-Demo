package falcon.spring5.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String INSCRIPTION = "This is the text";

    @Override
    public String getInscription() {
        return INSCRIPTION;
    }
}
