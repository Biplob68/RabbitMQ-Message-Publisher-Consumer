package com.biplob.springrabbitmqconsumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = RabbitMQConfig.MESSAGE_QUEUE)
    public void consumeMessage(Message message) {
        System.out.println(message);
    }
}
