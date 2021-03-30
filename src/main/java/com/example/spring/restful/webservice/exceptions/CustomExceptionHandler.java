package com.example.spring.restful.webservice.exceptions;

import com.example.spring.restful.webservice.entity.FormattedException;
import com.example.spring.restful.webservice.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<FormattedException> handleUserNotFoundException(UserNotFoundException ex, WebRequest request){
        FormattedException formattedException = FormattedException.formatException(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(formattedException,HttpStatus.NOT_FOUND);
    }
}
