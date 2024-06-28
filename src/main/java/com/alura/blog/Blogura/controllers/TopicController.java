package com.alura.blog.Blogura.controllers;

import com.alura.blog.Blogura.entities.dto.TopicDTO;
import com.alura.blog.Blogura.entities.dto.TopicResponseDTO;
import com.alura.blog.Blogura.services.TopicService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import org.springframework.data.domain.Pageable;
import java.net.URI;
import java.util.ArrayList;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;


    @GetMapping
    @Operation(
            summary = "Get All topics",
            description = "Get all Topics",
            tags = { "consult", "post" })
    public ResponseEntity<Page<TopicResponseDTO>> getTopics(Pageable pageable){
        Page<TopicResponseDTO> topics = topicService.getTopics(pageable);

        return ResponseEntity.ok(topics);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Get a topic by ID",
            description = "Get Topic By ID",
            tags = { "consult", "post" })
    public ResponseEntity<TopicResponseDTO> getTopicsbyId(@PathVariable String id){
        TopicResponseDTO topic = topicService.getTopicbyId(id);

        return ResponseEntity.ok(topic);
    }

    @PostMapping
    @Transactional
    @Operation(
            summary = "register a new topic in database",
            description = "",
            tags = { "consult", "post" })
    public ResponseEntity<TopicResponseDTO> createTopic(@RequestBody @Valid TopicDTO topicDTO,
                                      UriComponentsBuilder uriComponentsBuilder){
        TopicResponseDTO response = topicService.createTopic(topicDTO);
        URI url = uriComponentsBuilder.path("topics/{id}").buildAndExpand(response.id()).toUri();
        return ResponseEntity.created(url).body(response);
    }


}
