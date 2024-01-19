package com.example.globalExceptionHandlersks.repository;

import com.example.globalExceptionHandlersks.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
