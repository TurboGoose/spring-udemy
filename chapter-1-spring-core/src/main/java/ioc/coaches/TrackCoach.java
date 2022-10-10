package ioc.coaches;

import ioc.fortuneservices.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just run, dude";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }

    private void setUp() {
        System.out.println("Initializing TrackCoach...");
    }

    private void tearDown() {
        System.out.println("Destroying TrackCoach...");
    }
}
