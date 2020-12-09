package com.brunoguedes.apiRestful.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brunoguedes.apiRestful.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	List<Post> findByTitleContainingIgnoreCase(String text);
}
