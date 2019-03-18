package com.springclouddemo.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-provider")
public interface DemoService {

    @GetMapping("/hello")
    public String hello();
}
