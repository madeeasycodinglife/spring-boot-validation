package com.madeeasy.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD,PARAMETER,CONSTRUCTOR,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CountryValidator.class)
public @interface Country {
    String message() default "we accept country only India and USA";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

