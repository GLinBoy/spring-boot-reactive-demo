package com.glinboy.sample.reactive.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.glinboy.sample.reactive.repository.CommentRepository;
import com.glinboy.sample.reactive.service.CommentService;
import com.glinboy.sample.reactive.service.dto.CommentDTO;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repository;

    private ModelMapper mapper = new ModelMapper();

    @Override
    public Flux<CommentDTO> findAll() {
        return repository.findAll()
                .map(c -> mapper.map(c, CommentDTO.class));
    }
}
