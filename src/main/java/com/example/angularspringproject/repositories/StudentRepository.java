package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
