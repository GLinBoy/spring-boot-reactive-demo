package com.glinboy.sample.reactive.service;

import com.glinboy.sample.reactive.service.dto.CommentDTO;
import reactor.core.publisher.Flux;

public interface CommentService {

    Flux<CommentDTO> findAll();

}
