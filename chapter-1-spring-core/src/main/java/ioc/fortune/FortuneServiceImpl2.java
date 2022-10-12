package ioc.fortune;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl2 implements FortuneService {
    @Override
    public String getFortune() {
        return "Fortune 2";
    }
}
