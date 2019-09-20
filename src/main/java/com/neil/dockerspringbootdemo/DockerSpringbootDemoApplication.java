package com.neil.dockerspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringbootDemoApplication.class, args);
    }

    @GetMapping("/hi")
    public String hello() {
        return "hi, springboot DOCKER.";
    }

}
