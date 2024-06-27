package com.alura.blog.Blogura.services;

import com.alura.blog.Blogura.entities.dto.TopicDTO;
import com.alura.blog.Blogura.entities.dto.TopicResponseDTO;
import com.alura.blog.Blogura.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public TopicResponseDTO createTopic(TopicDTO topicDTO){
        return null;
    }

}
