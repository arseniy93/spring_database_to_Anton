package config;

import dependency_injection.Ola;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"dependency_injection"})
public class ConfigDI {
    @Bean
    @Scope("prototype")
    public Ola helloWorld() {
        return new Ola();
    }
}
