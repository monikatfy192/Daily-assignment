package example.imp;
import example.interfaces.Coach;
import example.interfaces.FortuneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("foot")
public class FootballCoach implements Coach {
    //dependency
    @Autowired
    @Qualifier("happyFortuneServices")
    private FortuneServices fortuneServices;
    @Value("${coach.name}")
    private String coachName;
    @Value("${coach.email}")
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

    @PostConstruct
    public void init(){
        System.out.println("[footballCoach] in init method");
    }
    @PreDestroy
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

}
