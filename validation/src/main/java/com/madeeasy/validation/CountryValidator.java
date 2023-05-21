package com.madeeasy.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class CountryValidator implements ConstraintValidator<Country,String> {

    List<String> countryList = List.of("India","USA");
    @Override
    public void initialize(Country constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        // Initialize login if needed
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return countryList.contains(value);
    }
}
