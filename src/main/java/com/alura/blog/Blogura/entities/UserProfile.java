package com.alura.blog.Blogura.entities;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class UserProfile {
    private String id;
    private String profile;
}
