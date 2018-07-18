package irina.controllers;

import irina.domain.Breed;
import irina.domain.Species;
import irina.repositories.BreedRepository;
import irina.repositories.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SpeciesController {
    @Autowired
    private SpeciesRepository speciesRepository;

    @GetMapping(value = "/species", produces = "application/json")
    public List<Species> getAllSpecies(){
        List<Species> species = speciesRepository.findAll();

        return species;
    }
}
