package ioc.configs;

import ioc.coaches.Coach;
import ioc.coaches.TennisCoach;
import ioc.fortunes.FortuneService;
import ioc.fortunes.FortuneServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
public class SportConfig {
    @Bean
    public FortuneService fortuneService() {
        return new FortuneServiceImpl();
    }

    @Bean
    public Coach tennisCoach() {
        return new TennisCoach(fortuneService());
    }
}
