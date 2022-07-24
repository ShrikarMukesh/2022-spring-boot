package com.springopenapiexample.service;

import com.springopenapiexample.model.Blog;

import java.util.List;


public interface BlogService {

    Blog create(Blog blog);

    List<Blog> findByTitle(String title);

    Void delete(Long id);

    Blog update(Blog blog);

    Blog findById(Long id);

}
