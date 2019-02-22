package com.micky.democlientsgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;*/
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
//@EnableConfigServer
//@EnableDiscoveryClient
@EnableEurekaClient
public class DemoClientsGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoClientsGitApplication.class, args);
    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }*/

}
