package com.vera1s.appforperson.service;

import com.vera1s.appforperson.Person;
import com.vera1s.appforperson.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person getById(Integer id) {
        Optional<Person> optional = personRepository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

    @Override
    public void save(Person person) {
        if (person == null) {
            return;
        }

        personRepository.save(person);
    }

    @Override
    public void deleteById(Integer id) {
        if (id == null) {
            return;
        }
        personRepository.deleteById(id);
    }

    @Override
    public void update(Integer id, Person person) {
        if (person == null) {
            return;
        }
        Optional<Person> persistPersonOptional = personRepository.findById(id);
        if (persistPersonOptional.isPresent()) { //если есть
            Person persistPerson = persistPersonOptional.get();
            persistPerson.setName(person.getName()); //в старую person устанавливаем новое имя
            personRepository.save(persistPerson); //пересохраняем старую person
        }

    }
}
