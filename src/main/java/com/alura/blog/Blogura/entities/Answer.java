package com.alura.blog.Blogura.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
public class Answer {
    private String id;
    private String message;
    private Topic topic;
    private LocalDate creationDate;
    private Author author;

}
