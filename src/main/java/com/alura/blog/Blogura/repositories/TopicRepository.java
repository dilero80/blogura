package com.alura.blog.Blogura.repositories;

import com.alura.blog.Blogura.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigInteger;


@Repository
public interface TopicRepository extends JpaRepository<Topic, BigInteger>{

}
