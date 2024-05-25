package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${eureka.instance.instance-id}")
    private String port;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return port;
    }
}
