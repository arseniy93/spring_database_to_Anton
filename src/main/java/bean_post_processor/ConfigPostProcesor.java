package bean_post_processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan
@Configuration
public class ConfigPostProcesor {
    @Bean
    public HumanPostProcessor humanPostProcessor(){
        return new HumanPostProcessor();
    }
//    @Bean
//    public Human getHuman(){
//        return new Human();
//    }
}
