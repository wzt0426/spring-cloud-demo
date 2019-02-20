package com.micky.demoservice.controller;

import com.micky.demoservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public String test() {
       return helloService.test();
    }
}
