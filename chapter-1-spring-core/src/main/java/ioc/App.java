package ioc;

import ioc.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml")) {
            Coach coach = context.getBean("lifecycleCoach", Coach.class);
            System.out.println(coach.getDailyWorkout());
        }
    }
}
