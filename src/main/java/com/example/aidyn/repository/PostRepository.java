package com.example.aidyn.repository;

import com.example.aidyn.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
