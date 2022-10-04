package ioc.fortuneservices;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortuneMessage() {
        return "Just do it!";
    }
}
