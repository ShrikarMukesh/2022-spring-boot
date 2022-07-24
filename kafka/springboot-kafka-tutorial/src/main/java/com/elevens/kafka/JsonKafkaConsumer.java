package com.elevens.kafka;

import com.elevens.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "json_topic",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message reciced -> %s",user.toString()));
    }
}
