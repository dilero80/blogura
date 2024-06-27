package com.alura.blog.Blogura.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Entity
@Data
public class Topic {
    private String id;
    private String title;
    private String message;
    private LocalDate creationDate;
    private boolean status;
    private Author author;
    private Course course;
    private List<Answer> answers;


}
