package com.springclouddemo.client.controllers;

import com.springclouddemo.client.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    DemoService demoService;

    @GetMapping("/remote-hello")
    public String hello() {
        return demoService.hello();

    }
}
