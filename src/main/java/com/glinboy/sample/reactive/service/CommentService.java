package com.glinboy.sample.reactive.service;

import com.glinboy.sample.reactive.entity.Comment;
import reactor.core.publisher.Flux;

public interface CommentService {

    Flux<Comment> findAll();

}
