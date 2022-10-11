package ioc.coaches;

import org.springframework.stereotype.Component;

@Component
public class BoxCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Don't let him hit you";
    }
}
