package jpa.repository;

import jpa.model.Person;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//@Transactional
public interface PersonJPARepository extends JpaRepository<Person,Long>  {
//    List<Person> findByFirstName(String firstName);
}
