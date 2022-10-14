package ioc.coaches;

import ioc.fortunes.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach {
    @Value("${email}")
    private String email;
    private final FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the ball pls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }
}
