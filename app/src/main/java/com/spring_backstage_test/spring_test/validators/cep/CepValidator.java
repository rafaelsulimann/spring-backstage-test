package com.spring_backstage_test.spring_test.validators.cep;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.spring_backstage_test.spring_test.utils.Regex;

public class CepValidator implements ConstraintValidator<Cep, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CEP);
    }

}
