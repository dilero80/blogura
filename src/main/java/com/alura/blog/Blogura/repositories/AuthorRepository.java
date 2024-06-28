package com.alura.blog.Blogura.repositories;

import com.alura.blog.Blogura.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigInteger;

public interface AuthorRepository extends JpaRepository <Author, BigInteger>{
    UserDetails findByEmail(String email);
}
