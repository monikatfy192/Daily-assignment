package org.SpringBoot.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspects {

    @Before("execution(public void insertCustomer(*))")
    // execution expression is targeted method signature (we can use package.class.* for all methods in a class)
    public void logBeforeAddObj(){
        System.out.println("******** before adding customer to db ********");
    }



}
