package jdbc.mapper;

import jdbc.model.Person;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class PersonMapper implements RowMapper<Person> {
    @SneakyThrows
    @Override
    public Person mapRow(ResultSet resultSet, int i) {

        Person person = new Person();
        person.setId(resultSet.getLong("id"));
        person.setFirstName(resultSet.getString("first_name"));
        person.setLastName(resultSet.getString("last_name"));
        person.setAge(resultSet.getInt("age"));
        return person;
    }
}
