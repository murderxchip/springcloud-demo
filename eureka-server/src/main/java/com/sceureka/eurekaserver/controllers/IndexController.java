package com.sceureka.eurekaserver.controllers;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "hello springcloud";
    }
}
