package com.rabbitmqdemo.producer;

import com.rabbitmqdemo.config.MessageUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerService {
    private final AmqpTemplate rabbitTemplate;

    public void send(String body) {
        rabbitTemplate.convertAndSend(MessageUtil.QUEUE, body);
        log.info("Message sent: " + body);
    }
}
