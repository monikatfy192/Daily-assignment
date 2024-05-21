package com.example.imp;
import com.example.interfaces.Coach;
import com.example.interfaces.FortuneServices;
import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach ,FortuneServices{
    //dependency
    private FortuneServices fortuneServices;

    private String coachName;

    private String coachEmail;

    public String getCoachEmail() {
        return coachEmail;
    }

    public void setCoachEmail(String coachEmail) {
        this.coachEmail = coachEmail;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public FortuneServices getFortuneServices() {
        return fortuneServices;
    }

    public FootballCoach() {
        System.out.println("[footballCoach] in constractor ");
    }

    public void setFortuneServices(FortuneServices fortuneServices) {
        System.out.println("[footballCoach] in setter method");
        this.fortuneServices = fortuneServices;
    }

    public void init(){
        System.out.println("[footballCoach] in init method");
    }
    public void destroy(){
        System.out.println("[footballCoach] in destroy method");
    }
    @Override
    public String getDailyWork() {
        return "practice football for 2 hour daily";
    }

    @Override
    public String getDailyFortuneServices() {
        return fortuneServices.getDailyFortune();
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getDailyFortune();
    }
}
