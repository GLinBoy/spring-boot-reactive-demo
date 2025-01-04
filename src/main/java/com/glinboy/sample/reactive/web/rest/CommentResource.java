package com.glinboy.sample.reactive.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glinboy.sample.reactive.service.CommentService;
import com.glinboy.sample.reactive.service.dto.CommentDTO;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentResource {

    private final CommentService service;

    @GetMapping
    public Flux<CommentDTO> getAllComments() {
        return service.findAll();
    }
}
