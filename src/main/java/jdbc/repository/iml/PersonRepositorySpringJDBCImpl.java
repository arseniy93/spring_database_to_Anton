package jdbc.repository.iml;

import jdbc.mapper.PersonMapper;
import jdbc.model.Person;
import jdbc.repository.PersonRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;
@Getter
@Setter
@Component
@RequiredArgsConstructor
public class PersonRepositorySpringJDBCImpl implements PersonRepository {

    private final JdbcTemplate jdbcTemplate;
    private final TransactionTemplate template;
    private final PersonMapper personMapper;

    private final String SQL_FIND_PERSON = "select * from people where id = ?";
    private final String SQL_DELETE_PERSON = "delete from people where id = ?";
    private final String SQL_UPDATE_PERSON = "update people set first_name = ?, last_name = ?, age  = ? where id = ?";
    private final String SQL_GET_ALL = "select * from people";
    private final String SQL_INSERT_PERSON = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";
@Override
    public Person getPersonById(Long id) {
        return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
    }
    @Override
    public List<Person> getAllPersons() {
        return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
    }
    @Override
    public boolean deletePerson(Person person) {
        return  template.execute(status -> jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0);
    }
    @Override
   // @Transactional
    public boolean updatePerson(Person person) {
        return jdbcTemplate.update(SQL_UPDATE_PERSON, person.getFirstName(), person.getLastName(), person.getAge(),
                person.getId()) > 0;
    }
    @Override
    public boolean createPerson(Person person) {
        return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
                person.getAge()) > 0;
    }
}
