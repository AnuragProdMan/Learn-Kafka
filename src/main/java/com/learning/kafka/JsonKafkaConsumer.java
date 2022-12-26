package com.learning.kafka;

import com.learning.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "apsJsonTopic",groupId = "myGroup")
    public void getMessage(User data){
        LOGGER.info("Received the message" + data.toString());
    }
}
