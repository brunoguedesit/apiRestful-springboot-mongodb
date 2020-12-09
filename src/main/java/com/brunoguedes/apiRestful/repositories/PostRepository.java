package com.brunoguedes.apiRestful.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brunoguedes.apiRestful.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
