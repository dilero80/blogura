package com.alura.blog.Blogura.entities;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Course {
    private String id;
    private String name;
}
