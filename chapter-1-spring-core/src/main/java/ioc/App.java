package ioc;

import ioc.coaches.Coach;
import ioc.coaches.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());
            System.out.println(coach.getEmail());
        }
    }
}
