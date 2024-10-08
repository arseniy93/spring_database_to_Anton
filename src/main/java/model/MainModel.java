package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainModel {
    public static void main(String[] args) {
        BeanFactory context= new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        Furneture r= (Furneture) context.getBean("kok");
        ServiceLocatorFactoryBean serviceLocatorFactoryBean=new ServiceLocatorFactoryBean();
        System.out.println(serviceLocatorFactoryBean.getObjectType());
        System.out.println(r);

        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        User user = context1.getBean(User.class);
        System.out.println(user.toString());
        Furneture furneture = context1.getBean(Furneture.class);
        System.out.println(furneture.toString());
    }
}
