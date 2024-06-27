package com.alura.blog.Blogura.entities.dto;

import jakarta.validation.constraints.NotNull;

public record TopicDTO(
    @NotNull
    String title,
    @NotNull
    String message

) {

}
