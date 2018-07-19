package irina.controllers;

import irina.domain.Card;
import irina.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CardController {
    @Autowired
    private CardRepository cardRepository;

    @GetMapping(value = "/cards", produces = "application/json")
    public List<Card> getAllCards(){
        List<Card> cards = cardRepository.findAll();

        return cards;
    }

    @PostMapping("/cards")
    public Card createCard(@RequestBody Card card){
        cardRepository.save(card);

        return card;
    }

}