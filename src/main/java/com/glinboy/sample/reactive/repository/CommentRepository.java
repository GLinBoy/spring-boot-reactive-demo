package com.glinboy.sample.reactive.repository;

import com.glinboy.sample.reactive.entity.Comment;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CommentRepository extends R2dbcRepository<Comment, String> {

}
