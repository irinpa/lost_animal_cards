package irina.controllers;

import irina.domain.Card;
import irina.domain.Comment;
import irina.repositories.CardRepository;
import irina.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/comments", produces = "application/json")
    public List<Comment> getAllComments(){
        List<Comment> comments = commentRepository.findAll();

        return comments;
    }


}
