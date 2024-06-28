package com.alura.blog.Blogura.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "answers")
@Entity(name = "Answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String message;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topics_id")
    private Topic topic;

    private LocalDate creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authors_id")
    private Author author;

}
