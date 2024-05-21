package example.main;

import example.config.Configration;
import example.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //create context
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Configration.class);

        Coach scoach=  context.getBean("swimmingCoach", Coach.class);
        System.out.println(scoach.getDailyFortuneServices());
        System.out.println(scoach.getDailyWork());
        context.close();
    }
}