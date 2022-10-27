package com.springbootjunit.repository;

import java.util.List;

import com.springbootjunit.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenera(String genera);
}
