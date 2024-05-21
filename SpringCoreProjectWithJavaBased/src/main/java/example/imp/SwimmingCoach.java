package example.imp;

import example.interfaces.Coach;
import example.interfaces.FortuneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SwimmingCoach implements Coach {
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

    public SwimmingCoach() {
        System.out.println("[swimCoach] in constractor ");
    }

    public void setFortuneServices(FortuneServices fortuneServices) {
        System.out.println("[swimCoach] in setter method");
        this.fortuneServices = fortuneServices;
    }

    @PostConstruct
    public void init(){
        System.out.println("[swimCoach] in init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("[swimCoach] in destroy method");
    }

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
