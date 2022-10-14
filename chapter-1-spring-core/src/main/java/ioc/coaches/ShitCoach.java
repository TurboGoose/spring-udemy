package ioc.coaches;

import ioc.fortunes.FortuneService;

public class ShitCoach implements Coach {
    private final FortuneService fortuneService;

    public ShitCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run, you motherfucker!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
