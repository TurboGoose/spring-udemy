package ioc.coaches;

import ioc.fortunes.FortuneService;

public class TennisCoach implements Coach {
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
}
