package com.example.angularspringproject.controllers;

import com.example.angularspringproject.entities.Student;
import com.example.angularspringproject.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    // get all
    @RequestMapping(value = "", produces = "application/json")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    // get one by id
    @RequestMapping(value = "/{id}", produces = "application/json")
    public Student getById(@PathVariable(value = "id") Integer id){
        return studentRepository.getOne(id);
    }

    // add one
    @PostMapping("/")
    public Student create(@RequestBody Student student){
        return studentRepository.save(student);
    }

    // update
    @PutMapping("/")
    public Student update(@RequestBody Student student){
        return studentRepository.save(student);
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> delete(@PathVariable(value = "id") int id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
