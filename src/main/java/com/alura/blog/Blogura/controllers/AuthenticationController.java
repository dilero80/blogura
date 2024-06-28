package com.alura.blog.Blogura.controllers;

import com.alura.blog.Blogura.entities.Author;
import com.alura.blog.Blogura.entities.dto.UserAuthData;
import com.alura.blog.Blogura.security.DatosJWTToken;
import com.alura.blog.Blogura.services.TokenService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
@Tag(name = "Authentication", description = "Get token for user asignated to use api")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity userAuthentication (@RequestBody @Valid UserAuthData userAuthData){
        Authentication authToken = new UsernamePasswordAuthenticationToken(userAuthData.email(),
                userAuthData.password());
        var authUser = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generateToken((Author) authUser.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }


}
