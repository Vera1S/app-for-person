package com.vera1s.appforperson.service;

import com.vera1s.appforperson.Person;

public interface PersonService {

    Person getById(Integer id);

    void save(Person person);

    void deleteById(Integer id);

    void update(Integer id, Person person);

}
