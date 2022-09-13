package com.ead.authuser.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})//Onde podemos usar essa anotação
@Retention(RetentionPolicy.RUNTIME)//Define que a validação vai ocorrer em tempo de execução
public @interface UsernameConstraint {
    String message() default "Invalid username";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
