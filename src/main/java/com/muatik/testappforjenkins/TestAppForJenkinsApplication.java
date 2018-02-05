package com.muatik.testappforjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestAppForJenkinsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestAppForJenkinsApplication.class, args);
    }

    @GetMapping
    public String greetigs() {
        return "Hello, it works. That's all.";
    }

}
