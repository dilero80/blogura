package com.alura.blog.Blogura.services;

import com.alura.blog.Blogura.entities.Author;
import com.alura.blog.Blogura.entities.Course;
import com.alura.blog.Blogura.entities.Topic;
import com.alura.blog.Blogura.entities.dto.TopicDTO;
import com.alura.blog.Blogura.entities.dto.TopicResponseDTO;
import com.alura.blog.Blogura.enumerators.UserProfiles;
import com.alura.blog.Blogura.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;


@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;


    public TopicResponseDTO createTopic(TopicDTO topicDTO){
        System.out.println(topicDTO);
        Topic topic = topicRepository.save(new Topic(
                topicDTO.title(),
                topicDTO.message(),
                LocalDate.now(),
                true,
                new Author("1","DIEGO ROMERO",
                        "dilero@gmail.com","1234",
                        UserProfiles.ADMIN),
                new Course("1","PRUEBA"))
        );
        return new TopicResponseDTO(topic);
    }

    public Page<TopicResponseDTO> getTopics(Pageable pageable){
        Page<Topic> topics = topicRepository.findAll(pageable);
        return topics.map(TopicResponseDTO::new);
    }


    public TopicResponseDTO getTopicbyId(String id) {
        Optional<Topic> topic = topicRepository.findById(id);
        return new TopicResponseDTO(topic.get());
    }
}
