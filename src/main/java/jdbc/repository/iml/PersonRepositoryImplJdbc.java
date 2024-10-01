package jdbc.repository.iml;

import jdbc.mapper.PersonMapper;
import jdbc.model.Person;
import jdbc.repository.PersonRepository;
import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Component
@AllArgsConstructor
public class PersonRepositoryImplJdbc  {
//    private static final String DB_URL = "jdbc:postgresql://localhost:5432/spring";
//    private static final String USER = "sam";
//    private static final String PASS = "1234";
//    private static final String SELECT_BY_ID_SQL_QUERY = "SELECT id, first_name, last_name, age FROM people where id = ?";
//    private static final String SELECT_ALL_SQL_QUERY = "SELECT id, first_name, last_name, age FROM people";
//
//    private Connection connection;
//
//    public PersonRepositoryImplJdbc() throws SQLException {
//        connection = DriverManager.getConnection(DB_URL, USER, PASS);
//    }
//
//    public Person getPersonById(Long id) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_SQL_QUERY);
//            preparedStatement.setLong(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            resultSet.next();
//
//            long personId = resultSet.getLong("id");
//            int age = resultSet.getInt("age");
//            String lastName = resultSet.getString("last_Name");
//            String firstName = resultSet.getString("first_Name");
//
//            return new Person(id, age, firstName, lastName);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<Person> getAllPersons() {
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(SELECT_ALL_SQL_QUERY);
//            PersonMapper mapper = new PersonMapper();
//
//            List<Person> persons = new ArrayList<>();
//            int i = 0;
//            while (resultSet.next()) {
//                persons.add(mapper.mapRow(resultSet, i++));
//            }
//
//            return persons;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public boolean deletePerson(Person person) {
//        String deleteSqlQuery = "DELETE FROM people WHERE id = ?";
//
//        try {
//            connection.setAutoCommit(false);
//            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
//
//            PreparedStatement preparedStatement = connection.prepareStatement(deleteSqlQuery);
//            preparedStatement.setLong(1, person.getId());
//            preparedStatement.execute();
//
//            connection.commit();
//
//        } catch (SQLException e) {
//            try {
//                connection.rollback();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//            throw new RuntimeException(e);
//        }
//
//
//        return false;
//    }
//
//    public boolean updatePerson(Person person) {
//        return false;
//    }
//
//    public boolean createPerson(Person person) {
//        return false;
//    }
}