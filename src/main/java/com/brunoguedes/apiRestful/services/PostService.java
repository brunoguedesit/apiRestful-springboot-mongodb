package com.brunoguedes.apiRestful.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoguedes.apiRestful.domain.Post;
import com.brunoguedes.apiRestful.repositories.PostRepository;
import com.brunoguedes.apiRestful.services.exception.ObjectNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public List<Post> findByTitle(String text) {
		return repository.searchTitle(text);
	}
}
	
	