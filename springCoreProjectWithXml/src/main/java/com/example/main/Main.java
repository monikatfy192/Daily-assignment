package com.example.main;
import com.example.imp.FootballCoach;
import com.example.interfaces.Coach;
import com.example.interfaces.FortuneServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //create context
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("file.xml");
        //get bean id
//        FortuneServices fortune= context.getBean("fortune", FortuneServices.class);
//        System.out.println(fortune.getDailyFortune());
//        System.out.println("write type of obj");
//        String type= scan.next();

        while (true) {
            System.out.println("write type of obj");
            String type= scan.next();
            Coach myCoach = context.getBean(type, Coach.class);
            // invoke
            System.out.println(myCoach.getDailyWork());
            System.out.println(myCoach.getDailyFortuneServices());

            if (myCoach instanceof FootballCoach){
                FootballCoach foot= (FootballCoach) myCoach;
                System.out.println(foot.getCoachEmail());
                System.out.println(foot.getCoachName());
            }
        }
    }
}