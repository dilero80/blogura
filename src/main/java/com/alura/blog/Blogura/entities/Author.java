package com.alura.blog.Blogura.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Author {
    private String id;
    private String name;
    private String email;
    private String password;
    private List<UserProfile> profiles;
}
