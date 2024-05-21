package org.example.validator;

import org.example.Customer;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.groups.Default;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = Customvalidtor.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface courseCode {

    public String value()default "luv";
    public String message ()default "must start with luv";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]Payload() default{};


}
