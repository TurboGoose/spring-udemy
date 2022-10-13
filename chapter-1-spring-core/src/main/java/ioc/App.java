package ioc;

import ioc.coaches.TennisCoach;
import ioc.configs.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class)) {
            TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());
        }
    }
}
