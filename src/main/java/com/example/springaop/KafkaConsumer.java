package com.example.springaop;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "quickstart-events", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }

}