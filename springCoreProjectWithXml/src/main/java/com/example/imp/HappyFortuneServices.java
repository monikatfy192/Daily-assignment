package com.example.imp;

import com.example.interfaces.FortuneServices;

public class HappyFortuneServices implements FortuneServices {
    @Override
    public String getDailyFortune() {
        return "happy";
    }
}
