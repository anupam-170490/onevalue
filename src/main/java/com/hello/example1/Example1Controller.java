package com.hello.example1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1Controller {
	@RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }
}
