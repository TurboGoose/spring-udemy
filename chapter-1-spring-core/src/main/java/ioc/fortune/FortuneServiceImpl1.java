package ioc.fortune;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl1 implements FortuneService {
    @Override
    public String getFortune() {
        return "Fortune 1";
    }
}
