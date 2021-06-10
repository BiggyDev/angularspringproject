package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);
    Boolean existsByEmail(String email);
}
