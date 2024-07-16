package com.glinboy.sample.reactive.service.dto;

public record CommentDTO(
    String id,
    String content,
    String itemId,
    String userId,
    String parentId
) {

}
