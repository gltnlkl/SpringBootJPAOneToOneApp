package com.gulukal.blogonetooneapp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;


//exception annotation
@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String massage) {

        super(massage);
    }

    public ResourceNotFoundException(String massage, Throwable throwable){

        super(massage,throwable);
    }
}
