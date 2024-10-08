package resurse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class BeanRecourseMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBeanResource.class);
        BeanRecource beanRecource=context.getBean(BeanRecource.class);

        try {
            beanRecource.output();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
