package jpa;

import jpa.repository.PersonJPARepository;
import jpa.service.PersonService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(DatabaseConfig.class);
        //PersonService personService=applicationContext.getBean("personService", PersonService.class);
            PersonJPARepository personJPARepository=applicationContext.getBean(PersonJPARepository.class);
            personJPARepository.findAll();
        //System.out.println(personService.getAllPerson());
        System.out.println("jh");;

        // personJPARepository.findAll().forEach(System.out::print);
       // applicationContext.close();
    }
}
