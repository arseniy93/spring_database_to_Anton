package propertyeditor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class PropertyEditorConfig {
    @Bean
   public DatePropertyEditor datePropertyEditor(){
        return new DatePropertyEditor("11-11-2000");
    }

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd");
    }
}
