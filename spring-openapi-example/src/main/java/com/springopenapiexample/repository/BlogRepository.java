package com.springopenapiexample.repository;

import com.springopenapiexample.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends MongoRepository<Blog,Long> {
    @Query("{'blogtitle':?0}")
    public List<Blog> findByTitle(String title);
}
