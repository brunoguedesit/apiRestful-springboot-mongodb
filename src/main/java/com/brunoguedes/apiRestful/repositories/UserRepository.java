package com.brunoguedes.apiRestful.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brunoguedes.apiRestful.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
