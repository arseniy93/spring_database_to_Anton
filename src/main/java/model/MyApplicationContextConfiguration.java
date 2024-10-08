package model;

import bean_post_processor.HumanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan//где лежат наши класса,которыми спринг будет создавать сам классы
public class MyApplicationContextConfiguration {
    @Bean
    @Scope("singleton")
    public User createUsrt() {
        return new User();
    }

    @Bean(name={"furneture","kok"})
    public Furneture createFurneture() {
        return new Furneture();
    }

}
