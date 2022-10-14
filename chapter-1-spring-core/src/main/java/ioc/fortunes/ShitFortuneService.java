package ioc.fortunes;

public class ShitFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "If you stop I'll beat the shit out of you!";
    }
}
