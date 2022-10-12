package ioc.coaches;

import ioc.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    public TennisCoach(@Qualifier("fortuneServiceImpl1") FortuneService fortuneService) {
        System.out.println("Inside constructor : " + fortuneService);
        this.fortuneService = fortuneService;
    }

    @Autowired
    public void checkMethodInjectionWithQualifier(@Qualifier("fortuneServiceImpl2") FortuneService fortuneService) {
        System.out.println("Inside checkMethodInjectionWithQualifier : " + fortuneService);
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
