package ioc.coaches;

import ioc.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Call default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the ball pls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
