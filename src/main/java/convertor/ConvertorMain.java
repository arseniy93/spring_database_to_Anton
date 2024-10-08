package convertor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConvertorMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigConvertor.class);
        IntegerToString integerToString=applicationContext.getBean(IntegerToString.class);
        System.out.println(integerToString.convert("9"));

    }
}
