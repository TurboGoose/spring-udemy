package ioc.coaches;

import ioc.fortuneservices.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortune;

    public BaseballCoach(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Just throw the ball, dude";
    }

    @Override
    public String getDailyFortune() {
        return "Let's gooooo maaaan";
    }
}
