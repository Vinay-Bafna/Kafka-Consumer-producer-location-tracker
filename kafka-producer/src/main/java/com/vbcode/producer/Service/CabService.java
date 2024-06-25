package com.vbcode.producer.Service;

import com.vbcode.producer.Constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean cabService(String locations){
        this.kafkaTemplate.send(AppConstant.Cab_Topic,locations);
        return true;
    }
}
