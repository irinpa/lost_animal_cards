package irina.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import irina.domain.Breed;
import irina.repositories.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class BreedController {
    @Autowired
    private BreedRepository breedRepository;

    @GetMapping(value = "/breeds", produces = "application/json")
    public List<Breed>  getAllBreeds(){
        List<Breed> breeds = breedRepository.findAll();

        return breeds;
    }


}
