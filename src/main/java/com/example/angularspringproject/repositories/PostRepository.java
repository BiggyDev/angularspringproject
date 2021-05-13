package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
