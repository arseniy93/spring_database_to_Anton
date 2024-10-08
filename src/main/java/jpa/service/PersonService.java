package jpa.service;

import jpa.model.Person;
import jpa.repository.PersonJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonJPARepository personJPARepository;

    public Optional<Person> getAllPerson(Long id) {
        return personJPARepository.findById(id);
    }

}
