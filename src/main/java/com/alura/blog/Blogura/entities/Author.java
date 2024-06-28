package com.alura.blog.Blogura.entities;

import com.alura.blog.Blogura.enumerators.UserProfiles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
@Table(name = "authors")
@Entity(name = "Author")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserProfiles profiles;
}
