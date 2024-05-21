package org.example.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class Customvalidtor implements ConstraintValidator<courseCode, String> {
    private String prefix;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
       if(value!= null&& value.startsWith(prefix)){
           return true;
       }else {
           return false;
       }
    }

@Override
    public void initialize(courseCode coursecode) {
      this.prefix=coursecode.value();
    }
}
