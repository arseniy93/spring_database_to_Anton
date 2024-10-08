package jpa.repository;

import jpa.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJPARepository extends CrudRepository<Person, Long> {
}
