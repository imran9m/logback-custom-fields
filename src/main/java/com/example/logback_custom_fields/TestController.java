package com.example.logback_custom_fields;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    public TestController() {
    }

    @GetMapping("/hello")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok("Hello, World");
    }
}
