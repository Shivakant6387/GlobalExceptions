package com.example.globalExceptionHandlersks.controller;

import com.example.globalExceptionHandlersks.exception.BlogAlreadyExistsException;
import com.example.globalExceptionHandlersks.exception.BlogNotFoundException;
import com.example.globalExceptionHandlersks.model.Blog;
import com.example.globalExceptionHandlersks.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping("/blog")
    public ResponseEntity saveBlog(@RequestBody Blog blog) throws BlogAlreadyExistsException {
        Blog savedBlog = blogService.saveBlog(blog);
        return new ResponseEntity<>(savedBlog, HttpStatus.CREATED);
    }
    @GetMapping("/blogs")
    public ResponseEntity<List> getAllBlogs() throws BlogNotFoundException {
        return new ResponseEntity<List>((List) blogService.getAllBlogs(), HttpStatus.OK);
    }
    @GetMapping("blog/{id}")
    public ResponseEntity getBlogById(@PathVariable("id") int id) throws BlogNotFoundException {
        return new ResponseEntity(blogService.getBlogById(id), HttpStatus.OK);
    }
}
