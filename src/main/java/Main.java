import model.MyApplicationContextConfiguration;
import model.Furneture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resurse.BeanRecource;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //BeanFactory context= new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
//        Furneture r= (Furneture) context.getBean("kok");
//        ServiceLocatorFactoryBean serviceLocatorFactoryBean=new ServiceLocatorFactoryBean();
//        System.out.println(serviceLocatorFactoryBean.getObjectType());
//        System.out.println(r);

        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
//        User user = context.getBean(User.class);
//       HumanPostProcessor humanPostProcessor=context.getBean(HumanPostProcessor.class);
//       humanPostProcessor.postProcessAfterInitialization(user, user.getName());


        BeanRecource beanRecource=context.getBean(BeanRecource.class);


        try {
            beanRecource.output();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Furneture furneture = context.getBean(Furneture.class);
        //System.out.println(user);
        System.out.println(furneture);
//
//        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigDI.class);
//        CarWithSetter carWithSetter = context1.getBean(CarWithSetter.class);
//        carWithSetter.setEngine(new Engine());
//        System.out.println(carWithSetter.toString());
//        Ola ola = context1.getBean(Ola.class);
//        System.out.println(ola.hashCode());
//        Ola ola1 = context1.getBean(Ola.class);
//        System.out.println(ola1.hashCode());
//        context1.close();
    }
}
