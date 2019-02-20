package com.micky.demosconusmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {

    @Bean
    @LoadBalanced
    public RestTemplate  restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer/demo")
    public String ConsumerDemo() {
        ServiceInstance choose = loadBalancerClient.choose("provider-demo");
        System.out.println(choose.getMetadata().toString());
        //return choose.getPort()+"";
        return this.restTemplate.getForObject("http://PROVIDER-DEMO/provider/demo",String.class);
    }

    @RequestMapping("/consumer/demo2")
    public String ConsumerDemo2() {
        return "hello";

    }
}
