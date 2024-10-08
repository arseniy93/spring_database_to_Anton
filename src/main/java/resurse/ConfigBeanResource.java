package resurse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;
@Configuration
public class ConfigBeanResource {
    @Value("classpath:ex.txt")
    private Resource exampleResource;

    @Bean
    public BeanRecource myBean() throws IOException {
        return new BeanRecource(exampleResource);
    }
}
