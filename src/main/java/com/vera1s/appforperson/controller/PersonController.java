package com.vera1s.appforperson.controller;


import com.vera1s.appforperson.Person;
import com.vera1s.appforperson.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Service
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/person/{id}")
    public Person getById(@PathVariable(value = "id") Integer id) {
        Person person = personService.getById(id);
        return person;
    }

    @PostMapping(value = "/person")
    public void savePerson(@RequestBody Person person) {

        personService.save(person);
    }

    @DeleteMapping(value = "/person/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        personService.delecteById(id);
    }

    @PutMapping(value = "/person/{id}")
    public void updatePersonById(@PathVariable(value = "id") Integer id, @RequestBody Person person) {
        personService.update(id, person);
    }

}
