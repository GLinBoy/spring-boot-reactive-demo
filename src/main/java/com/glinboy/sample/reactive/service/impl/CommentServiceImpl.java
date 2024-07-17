package com.glinboy.sample.reactive.service.impl;

import com.glinboy.sample.reactive.entity.Comment;
import com.glinboy.sample.reactive.repository.CommentRepository;
import com.glinboy.sample.reactive.service.CommentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repository;

    @Override
    public Flux<Comment> findAll() {
        return repository.findAll();
    }
}
