package com.micky.demoservice.service;


import org.springframework.stereotype.Component;

/**
 * 熔断器类
 */
@Component
public class RemoteClientHystric implements HelloService{
    @Override
    public String test1() {
        return "Error";
    }
}
