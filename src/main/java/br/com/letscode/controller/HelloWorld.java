package br.com.letscode.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/helloWorld", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(){
        return("Hello World");
    };



}
