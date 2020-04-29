package com.wipro.crud.controller;

import com.wipro.crud.models.Person;
import com.wipro.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Iterable<Person> personList() {
        return personRepository.findAll();
    }

    @PostMapping()
    public Person addPerson(@RequestBody @Valid Person person) {
        return personRepository.save(person);

    }

    @DeleteMapping()
    public Person deletePerson(@RequestBody Person person) {
        personRepository.delete(person);
        return person;
    }
}
