package jdbc.repository;

import jdbc.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonRepository {
    Person getPersonById(Long id);

    List<Person> getAllPersons();

    boolean deletePerson(Person person);

    boolean updatePerson(Person person);

    boolean createPerson(Person person);

}
