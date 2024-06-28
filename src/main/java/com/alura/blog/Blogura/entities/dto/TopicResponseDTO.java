package com.alura.blog.Blogura.entities.dto;

import com.alura.blog.Blogura.entities.Answer;
import com.alura.blog.Blogura.entities.Author;
import com.alura.blog.Blogura.entities.Course;
import com.alura.blog.Blogura.entities.Topic;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public record TopicResponseDTO(BigInteger id, String title, String message,
                               LocalDate creationDate, boolean status,
                               String author, String course){
    public TopicResponseDTO (Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(),
                topic.getCreationDate(), topic.isStatus(),
                topic.getAuthor().getName(),topic.getCourse().getName());
    }
}
