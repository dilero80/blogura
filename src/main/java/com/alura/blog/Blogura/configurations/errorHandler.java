package com.alura.blog.Blogura.configurations;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class errorHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handlerError4041(){
        System.out.println("encontre el error");
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Not Found");
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity handlerError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handlerError400(MethodArgumentNotValidException e){
        var errors = e.getFieldErrors().stream().map(ValidationErrorsData::new).toList();
        return ResponseEntity.badRequest().body(errors);
    }

    private record ValidationErrorsData(String campo, String error){
        public ValidationErrorsData(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }
    }


}
