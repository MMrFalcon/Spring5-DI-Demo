package falcon.spring5.didemo.service;

import falcon.spring5.didemo.Repository.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "pl":
                return new PrimaryPolishGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);

        }
    }
}
