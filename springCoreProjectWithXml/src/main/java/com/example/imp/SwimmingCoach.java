package com.example.imp;

import com.example.interfaces.Coach;
import com.example.interfaces.FortuneServices;

public class SwimmingCoach implements Coach {
    //dependency
    private FortuneServices fortuneServices;

    public SwimmingCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDailyWork() {
        return "practice swimming for 2 hour daily";
    }

    @Override
    public String getDailyFortuneServices() {
        return fortuneServices.getDailyFortune();
    }
}
