package validator_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;

@Configuration
public class ConfigEntity {

    @Bean
    public Validator userValidator() {
        return new EntityValidation();
    }
}
