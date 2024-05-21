package example.imp;

import example.interfaces.Coach;
import example.interfaces.FortuneServices;

public class TennisCoach implements Coach {
    //dependency
    private FortuneServices fortuneServices;

    public TennisCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    //xml start
    @Override
    public String getDailyWork() {
        return "practice tennis for 2 hour daily";
    }
    //xml end


    @Override
    public String getDailyFortuneServices() {
        return fortuneServices.getDailyFortune();
    }
}
