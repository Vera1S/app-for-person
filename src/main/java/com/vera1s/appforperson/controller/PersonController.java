package com.vera1s.appforperson.controller;


import com.vera1s.appforperson.Person;
import com.vera1s.appforperson.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/person/{id}")
    public Person getById(Integer id)



}
