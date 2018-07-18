package irina.controllers;

import irina.domain.Card;
import irina.domain.Person;
import irina.repositories.CardRepository;
import irina.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/people", produces = "application/json")
    public List<Person> getAllPersons(){
        List<Person> persons = personRepository.findAll();

        return persons;
    }


}
