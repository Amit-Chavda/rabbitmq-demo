package com.rabbitmqdemo.controller;

import com.rabbitmqdemo.producer.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProducerController {
    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<Object> produceMessage(@RequestBody String body) {
        producerService.send(body);
        return ResponseEntity.ok("Successful");
    }

}
