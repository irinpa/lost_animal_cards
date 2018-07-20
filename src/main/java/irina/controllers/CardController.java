package irina.controllers;

import irina.domain.Card;
import irina.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(value = "/cards/{cardId}", produces = "application/json")
    public Card getCardById( @PathVariable("cardId") Long cardId){
        Optional<Card> card = cardRepository.findById(cardId);

        return card.get();
    }

    @PostMapping("/cards")
    public Card createCard(@RequestBody Card card){
        cardRepository.save(card);

        return card;
    }

}