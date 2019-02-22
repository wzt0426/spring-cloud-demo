package com.micky.democlientsgit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/test")
    public String Test() {
        return this.hello;
    }
}
