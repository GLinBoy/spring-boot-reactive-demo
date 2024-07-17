package com.glinboy.sample.reactive.web.rest;

import com.glinboy.sample.reactive.entity.Comment;
import com.glinboy.sample.reactive.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentResource {

    private final CommentService service;

    @GetMapping
    public Flux<Comment> getAllComments() {
        return service.findAll();
    }
}
