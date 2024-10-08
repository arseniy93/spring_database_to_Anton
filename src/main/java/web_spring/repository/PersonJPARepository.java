package web_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web_spring.model.Person;

@Repository
//@Transactional
public interface PersonJPARepository extends JpaRepository<Person,Long>  {
//    List<Person> findByFirstName(String firstName);
}
