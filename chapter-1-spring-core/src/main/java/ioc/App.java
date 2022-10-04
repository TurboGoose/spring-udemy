package ioc;

import ioc.coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            CricketCoach coach = context.getBean("cCoach", CricketCoach.class);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());
            System.out.println(coach.getEmailAddress());
            System.out.println(coach.getTeam());
        }
    }
}
