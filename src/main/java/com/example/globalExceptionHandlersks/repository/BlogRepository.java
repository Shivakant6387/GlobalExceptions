package com.example.globalExceptionHandlersks.repository;

import com.example.globalExceptionHandlersks.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
