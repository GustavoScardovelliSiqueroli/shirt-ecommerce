package com.project.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ShirtController {

    @GetMapping("/")
    public String test(){
        return "Peida não xerequinha";
    }
}
