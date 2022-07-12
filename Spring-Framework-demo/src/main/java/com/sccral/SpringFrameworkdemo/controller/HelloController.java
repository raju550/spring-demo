package com.sccral.SpringFrameworkdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Object> getHelloWorld(){
        String result = " Hello World";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
