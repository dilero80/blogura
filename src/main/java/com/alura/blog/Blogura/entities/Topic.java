package com.alura.blog.Blogura.entities;

import com.alura.blog.Blogura.enumerators.UserProfiles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "topics")
@Entity(name = "Topic")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String title;
    private String message;
    private LocalDate creationDate;
    private boolean status;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "course")
    private Course course;

    @OneToMany (fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private List<Answer> answers;


    public Topic(String title, String message, LocalDate now,
                 boolean status, Author author, Course course) {
        this.title = title;
        this.message = message;
        this.creationDate = now;
        this.status = status;
        this.author = author;
        this.course = course;
        this.answers = new ArrayList<>();

    }

}
