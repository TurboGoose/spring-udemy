package ioc;

import ioc.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml")) {
            Coach coach1 = context.getBean("singletonCoach", Coach.class);
            Coach coach2 = context.getBean("singletonCoach", Coach.class);
            System.out.println("Singleton pointing to the same area of memory: " + (coach1 == coach2));

            coach1 = context.getBean("prototypeCoach", Coach.class);
            coach2 = context.getBean("prototypeCoach", Coach.class);
            System.out.println("Prototype pointing to the same area of memory: " + (coach1 == coach2));
        }
    }
}
