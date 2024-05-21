package com.example.imp;

import com.example.interfaces.FortuneServices;

public class SadFortuneServices implements FortuneServices {
    @Override
    public String getDailyFortune() {
        return "sad";
    }
}
