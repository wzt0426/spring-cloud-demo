package com.micky.demoservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "provider-demo",  fallback = RemoteClientHystric.class)
public interface HelloService {
    @RequestMapping(method = RequestMethod.GET, value = "test")
    String test();
}
