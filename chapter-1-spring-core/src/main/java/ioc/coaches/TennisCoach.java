package ioc.coaches;

import ioc.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    private FortuneService fortuneService;
    @Value("${email}")
    private String email;

    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println("Inside constructor : " + fortuneService);
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void setUp() {
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("@PreDestroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the ball pls";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }
}
