package com.biplob.springrabbitmqproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish-message")
    public String publishMessage(@RequestBody Message message){
        message.setMessageId(UUID.randomUUID().toString());
        message.setDateOfMessage(new Date());
        template.convertAndSend(RabbitMQConfig.MESSAGE_EXCHANGE,
                RabbitMQConfig.MESSAGE_ROUTING_KEY, message);
        return "Message Published into Rabbit Queue!";

    }
}
