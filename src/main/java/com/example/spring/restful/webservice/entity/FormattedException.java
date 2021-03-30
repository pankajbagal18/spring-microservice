package com.example.spring.restful.webservice.entity;

import java.util.Date;


public class FormattedException {
    private Date timestamp;
    private String message;
    private String description;

    public FormattedException(Date timestamp, String message, String description) {
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public static FormattedException formatException(Date timestamp, String message, String description){
        return new FormattedException(timestamp,message,description);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
