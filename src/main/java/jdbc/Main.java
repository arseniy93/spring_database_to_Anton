package jdbc;

import jdbc.model.Person;
import jdbc.repository.iml.PersonRepositorySimple;
import jdbc.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(DatabaseConfig.class);
        PersonRepositorySimple personRepositorySimple=applicationContext.getBean(PersonRepositorySimple.class);
//        PersonRepository repository=applicationContext.getBean("personRepositorySpringJDBCImpl",PersonRepository.class);
//        Person person=repository.getPersonById(1L);
       List<Person> person1=personRepositorySimple.findByLastNameOrFirstName("Boyarskiy","Oksi");
        System.out.println(person1);
//        PersonService personService=applicationContext.getBean(PersonService.class);
//        Person p= personService.getPerson(2L);
//        System.out.println(p);
//        System.out.println(personService.getPerson(2L));


    }
}
