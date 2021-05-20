package com.example.angularspringproject.controllers;

import com.example.angularspringproject.entities.Comment;
import com.example.angularspringproject.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRespository;

    // get all
    @RequestMapping(value = "", produces = "application/json")
    public List<Comment> getAll(){
        return commentRespository.findAll();
    }

    // get one by id
    @RequestMapping(value = "/{id}", produces = "application/json")
    public Comment getById(@PathVariable(value = "id") Integer id){
        return commentRespository.getOne(id);
    }

    // add one
    @PostMapping("/")
    public Comment create(@RequestBody Comment comment){
        return commentRespository.save(comment);
    }

    // update
    @PutMapping("/")
    public Comment update(@RequestBody Comment comment){
        return commentRespository.save(comment);
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Comment> delete(@PathVariable(value = "id") int id){
        commentRespository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
