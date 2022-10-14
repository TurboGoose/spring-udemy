package ioc;

import ioc.coaches.Coach;
import ioc.configs.ShitConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ShitConfig.class)) {
            Coach shitCoach = context.getBean("shitCoach", Coach.class);
            System.out.println(shitCoach.getDailyWorkout());
            System.out.println(shitCoach.getDailyFortune());
        }
    }
}
