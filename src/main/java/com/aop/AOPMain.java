package com.aop;

import com.aop.repository.Repository;
import com.aop.repository.RepositoryImpl;
import com.aop.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config1.class);
        Service service=context.getBean(Service.class);
        Repository repository=context.getBean(RepositoryImpl.class);
        //terepository.prinf();
        service.print();
        service.print("asd");
        //context.close();
    }
}
