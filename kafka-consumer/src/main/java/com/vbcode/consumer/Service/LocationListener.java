package com.vbcode.consumer.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationListener {

    @KafkaListener(topics = "Cab-Location", groupId = "user-group")
    public void printKafkaListener(String locations) {
        System.out.println(locations);
    }
}
