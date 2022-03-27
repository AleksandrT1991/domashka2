package com.example.domashka2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class domashka2controller {
    @GetMapping
    public String printHello() {
return "Hello, World!";

    }
    }

