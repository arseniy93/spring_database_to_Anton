package jdbc;

import jdbc.model.Person;
import jdbc.repository.PersonRepository;
import jdbc.repository.iml.PersonRepositoryImplJdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.sql.SQLException;
import java.util.List;
//@EnableAspectJAutoProxy
//@Configuration
//@ComponentScan(value = "jdbc")
public class AppCongfig {
//    @Bean
//    public PersonRepository personRepository() throws SQLException {
//        return new PersonRepositoryImplJdbc();
//    }

}
