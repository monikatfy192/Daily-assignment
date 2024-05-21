package example.imp;
import example.interfaces.FortuneServices;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneServices {
    @Override
    public String getDailyFortune() {
        return "happy";
    }
}
