package com.example.spring.restful.webservice.entity;

import lombok.Data;

@Data
public class HelloWorldBean {
    String message;
    public HelloWorldBean(String message){
        this.message = message;
    }
}
