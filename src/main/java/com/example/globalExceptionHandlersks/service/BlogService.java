package com.example.globalExceptionHandlersks.service;

import com.example.globalExceptionHandlersks.exception.BlogAlreadyExistsException;
import com.example.globalExceptionHandlersks.exception.BlogNotFoundException;
import com.example.globalExceptionHandlersks.model.Blog;

import java.util.List;

public interface BlogService {

    Blog saveBlog(Blog blog) throws BlogAlreadyExistsException;
    List getAllBlogs() throws BlogNotFoundException;
    Blog getBlogById(int id) throws BlogNotFoundException;
}
