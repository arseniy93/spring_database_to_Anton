package jdbc.repository.iml;

import jdbc.model.Person;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepositorySimple extends CrudRepository<Person,Long> {
    Optional<Person> findByFirstNameAndLastName(String firstName, String lastName);
    @Query(value="select * from people where last_name=:last or first_name=:first")
    List<Person> findByLastNameOrFirstName(@Param(value="last") String lastName,@Param(value = "first") String firstName);// param парметр

}
