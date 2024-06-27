package com.alura.blog.Blogura.controllers;

import com.alura.blog.Blogura.entities.dto.TopicDTO;
import com.alura.blog.Blogura.services.TopicService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    @Transactional
    @Operation(
            summary = "register a new topic in database",
            description = "",
            tags = { "consult", "post" })
    public ResponseEntity createTopic(@RequestBody @Valid TopicDTO topicDTO){


        return ResponseEntity.ok(response);
    }


}
