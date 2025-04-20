package com.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EbsClass {

    @GetMapping("/message")
    public String getMessage(){
        return"Hello from Elastic Bean Stalk";
    }
}
