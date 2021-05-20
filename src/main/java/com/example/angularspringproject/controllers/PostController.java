package com.example.angularspringproject.controllers;

import com.example.angularspringproject.entities.Post;
import com.example.angularspringproject.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostRepository postRespository;

    // get all
    @RequestMapping(value = "/", produces = "application/json")
    public List<Post> getAll(){
        return postRespository.findAll();
    }

    // get one by id
    @RequestMapping(value = "/{id}", produces = "application/json")
    public Post getById(@PathVariable(value = "id") Integer id){
        return postRespository.getOne(id);
    }

    // add one
    @PostMapping("/")
    public Post create(@RequestBody Post post){
        return postRespository.save(post);
    }

    // update
    @PutMapping("/")
    public Post update(@RequestBody Post post){
        return postRespository.save(post);
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Post> delete(@PathVariable(value = "id") int id){
        postRespository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
