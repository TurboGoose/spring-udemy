package ioc.fortuneservices;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private static final String[] fortunes = new String[] {"Let's go", "Don't stop", "Keep pushing"};
    @Override
    public String getFortuneMessage() {
        Random rand = new Random();
        return fortunes[rand.nextInt(fortunes.length)];
    }
}
