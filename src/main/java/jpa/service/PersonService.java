package jpa.service;

import jpa.model.Person;
import jpa.repository.PersonJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service()
public class PersonService {
    private final PersonJPARepository personJPARepository;
    public List<Person> getAllPerson(){
        return personJPARepository.findAll();
    }
}
