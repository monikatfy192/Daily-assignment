package example.main;
import example.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //create context
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("file.xml");

        Coach foot=  context.getBean("foot", Coach.class);
        System.out.println(foot.getDailyFortuneServices());
        System.out.println(foot.getDailyWork());
        context.close();
    }
}