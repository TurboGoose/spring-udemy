package ioc.configs;

import ioc.coaches.Coach;
import ioc.coaches.ShitCoach;
import ioc.fortunes.FortuneService;
import ioc.fortunes.ShitFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShitConfig {
    @Bean
    public FortuneService shitFortuneService() {
        return new ShitFortuneService();
    }

    @Bean
    public Coach shitCoach() {
        return new ShitCoach(shitFortuneService());
    }
}
