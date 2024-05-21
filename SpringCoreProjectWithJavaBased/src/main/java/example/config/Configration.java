package example.config;

import example.imp.HappyFortuneServices;
import example.imp.SwimmingCoach;
import example.interfaces.FortuneServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("example")
@PropertySource("classpath:values.properties")

public class Configration {
    @Bean
    public SwimmingCoach swimmingCoach(){
        return new SwimmingCoach(happyFortuneServices());
    }
    public HappyFortuneServices happyFortuneServices(){
        return new HappyFortuneServices();
        }
    }

