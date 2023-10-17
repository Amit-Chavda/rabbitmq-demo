package com.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class RabbitMqConfig {
    @Bean
    public Queue messageQueue() {
        return new Queue(MessageUtil.QUEUE, true); // The 'true' argument enables mirrored queues
    }
}
