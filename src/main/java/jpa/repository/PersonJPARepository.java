package jpa.repository;

import jpa.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface PersonJPARepository extends JpaRepository<Person,Long>  {
    List<Person> findByFirstName(String firstName);
}
