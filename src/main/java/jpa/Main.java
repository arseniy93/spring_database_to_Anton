package jpa;

import jpa.config.DatabaseConfig;
import jpa.repository.PersonJPARepository;
import jpa.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        PersonJPARepository personJPARepository = applicationContext.getBean(PersonJPARepository.class);
        System.out.println(personJPARepository.findAll());
        System.out.println(personJPARepository.findById(1L));
        System.out.println("jh");
        PersonService personService=applicationContext.getBean(PersonService.class);
        System.out.println(personService.getAllPerson(2L));
    }
}
