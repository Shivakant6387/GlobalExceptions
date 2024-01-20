package com.example.globalExceptionHandlersks.service;

import com.example.globalExceptionHandlersks.model.User;

import java.util.List;

public interface UserService {
    public List<User> getTheUsersList();

    public void save(User user);

    public User findById(Integer id);

    public void delete(User user);
}
