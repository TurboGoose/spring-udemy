package ioc.coaches;

import ioc.fortuneservices.FortuneService;

public class BoxCoach implements Coach {
    private FortuneService fortuneService;

    public BoxCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just beat the bag, dude";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }
}
