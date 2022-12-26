package com.learning.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic anuragTopic(){
        return TopicBuilder.name("apsTopic").build();
    }

    @Bean
    public NewTopic anuragJsonTopic(){
        return TopicBuilder.name("apsJsonTopic").build();
    }

}
