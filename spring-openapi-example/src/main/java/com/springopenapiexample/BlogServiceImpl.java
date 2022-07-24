package com.springopenapiexample;

import com.springopenapiexample.model.Blog;
import com.springopenapiexample.repository.BlogRepository;
import com.springopenapiexample.service.BlogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Override
    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> findByTitle(String title) {
        return blogRepository.findByTitle(title);
    }


    @Override
    public Void delete(Long id) {
       blogRepository.deleteById(id);
        return null;
    }

    @Override
    public Blog update(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).get();
    }
}
