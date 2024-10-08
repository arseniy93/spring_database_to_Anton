package convertor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
@Configuration
public class ConfigConvertor {
    @Bean
    public IntegerToString simpleDateFormat(){
        return new IntegerToString();
    }
//    @Bean
//    public DateFormatter dateFormatter(){
//        return new DateFormatter();
//    }
}
