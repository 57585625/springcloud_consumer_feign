package com.example.demo.controller;

import com.example.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersController {

    @Autowired
    private CustomersService service;

    @GetMapping("/customers")
    public String helloConsumers2(){
        return service.hello();
    }
}
