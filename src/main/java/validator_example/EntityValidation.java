package validator_example;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EntityValidation implements Validator {
    @Override
    public boolean  supports (Class<?> clazz) {
        return Entity.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");

        Entity user = (Entity) target;
        if ((user.getPassword().length()) < 8) {
            errors.rejectValue("password", "Size.userForm.password");
        }
    }
}
