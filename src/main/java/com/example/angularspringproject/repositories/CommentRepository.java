package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
