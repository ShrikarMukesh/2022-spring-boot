package com.springopenapiexample;


import com.springopenapiexample.model.Blog;
import com.springopenapiexample.service.BlogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@AllArgsConstructor
public class BlogApiDelegateImpl implements BlogApiDelegate {

    private final BlogService blogService;


    @Override
    public ResponseEntity<List<Blog>> getBlogByTitle(String blogtitle) {
        List<Blog> byTitleList = blogService.findByTitle(blogtitle);
        log.info(" Results returned from getByBlogTitle ::: {}",byTitleList);
        return ResponseEntity.ok(byTitleList);
    }

    @Override
    public ResponseEntity<Blog> blogPost(Blog blog) {
        return ResponseEntity.ok(blogService.create(blog));
    }

    @Override
    public ResponseEntity<Blog> updateBlog(Blog blog) {

        Blog blogresult = blogService.update(blog);

        return ResponseEntity.ok(blogresult);
    }

    @Override
    public ResponseEntity<Void> deleteBlog(Long blogid) {
        blogService.delete(blogid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
