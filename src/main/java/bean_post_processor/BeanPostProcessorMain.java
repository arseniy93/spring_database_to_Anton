package bean_post_processor;

import model.MyApplicationContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigPostProcesor.class);
        Human human = context1.getBean(Human.class);
        HumanPostProcessor humanPostProcessor = context1.getBean(HumanPostProcessor.class);

        humanPostProcessor.postProcessAfterInitialization(human, human.getClass().getName());

    }
}
