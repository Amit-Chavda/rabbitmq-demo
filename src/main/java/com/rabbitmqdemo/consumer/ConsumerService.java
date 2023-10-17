package com.rabbitmqdemo.consumer;

import com.rabbitmqdemo.config.MessageUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConsumerService {
    @RabbitListener(queues = MessageUtil.QUEUE)
    public void receive(Message message) {
        log.info("Message received: " + new String(message.getBody()));
    }
}