package com.vbcode.producer.Config;

import com.vbcode.producer.Constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic cabTopic(){
        return TopicBuilder
                .name(AppConstant.Cab_Topic)
                .build();
    }
}
