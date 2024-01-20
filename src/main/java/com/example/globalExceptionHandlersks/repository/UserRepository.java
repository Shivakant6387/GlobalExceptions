package com.example.globalExceptionHandlersks.repository;

import com.example.globalExceptionHandlersks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer > {
}
