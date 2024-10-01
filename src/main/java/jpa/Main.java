package jpa;

import jdbc.DatabaseConfig;
import jpa.repository.PersonJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(DatabaseConfig.class);
        PersonJPARepository personJPARepository=applicationContext.getBean(PersonJPARepository.class);
        personJPARepository.findByFirstName("Vlad");
       // personJPARepository.findAll().forEach(System.out::print);
        applicationContext.close();
    }
}
