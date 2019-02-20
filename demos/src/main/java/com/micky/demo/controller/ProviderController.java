package com.micky.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/provider/demo")
    public String Demo() {
        return "providerDemo";
    }

    @RequestMapping("test")
    public String test() {
        return "test-service";
    }
}
