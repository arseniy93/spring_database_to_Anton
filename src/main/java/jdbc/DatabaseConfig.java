package jdbc;

import jdbc.mapper.PersonMapper;
import jdbc.model.Person;
import jdbc.repository.PersonRepository;
import jdbc.repository.iml.PersonRepositoryImplJdbc;
import jdbc.repository.iml.PersonRepositorySimple;
import jdbc.repository.iml.PersonRepositorySpringJDBCImpl;
import jdbc.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@ComponentScan(basePackages  = {"jdbc"})
@Configuration
@RequiredArgsConstructor
@EnableAspectJAutoProxy
@EnableJdbcRepositories(basePackages  = {"jdbc.repository"})//spring database
@PropertySource("classpath:database.properties")// go to file in this path dawn we set thise parapetrs

public class DatabaseConfig extends AbstractJdbcConfiguration {

    private final Environment environment;

    private final String URL = "url";
    private final String USER = "dbuser";
    private final String DRIVER = "driver";
    private final String PASSWORD = "dbpassword";

    @Bean//connect to database
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
        return driverManagerDataSource;
    }

    @Bean//упрощение работы с бд
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean//именования параметоров в запросе вместо ?
    public NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean//управление транзакциями
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean//управление транзакциями PlatformTransactionManager
    public TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager) {
        return new TransactionTemplate(transactionManager);
    }
    @Bean
    public PersonMapper personMapper(){
        return new PersonMapper();
    }

    @Bean
    public PersonRepository personRepository(JdbcTemplate jdbcTemplate,TransactionTemplate transactionTemplate,PersonMapper personMapper) throws SQLException {
        return new PersonRepositorySpringJDBCImpl(jdbcTemplate,transactionTemplate,personMapper);
    }

//    @Bean
//    public PersonService personService(){
//        return new PersonService(new PersonRepositorySimple());
//    }


}
