package jdbc.service;

import jdbc.model.Person;
import jdbc.repository.iml.PersonRepositorySimple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepositorySimple personRepositorySimple;
//TODO with Bean
    @Transactional//указание методы для создание транзакции или присоединение к потоку транзакции, если метод выболнился то комитем если нет ролбэк
    public Person getPerson(Long id){
        return personRepositorySimple.findById(id).orElse(null);
    }
}
