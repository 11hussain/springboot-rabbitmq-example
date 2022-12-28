package com.javainuse.rabbitmq.demo.consumer;

import com.javainuse.rabbitmq.demo.config.RabbitMQConfig;
import com.javainuse.rabbitmq.demo.dto.OrderStatus;
import com.rabbitmq.client.ConnectionFactory;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
    
    
//    CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//    AmqpAdmin admin = new RabbitAdmin((org.springframework.amqp.rabbit.connection.ConnectionFactory) connectionFactory);
//    admin.declareQueue(new Queue("myqueue"));
//    AmqpTemplate template = new RabbitTemplate();
//    template.convertAndSend("myqueue", "foo");
//    String foo = (String) template.receiveAndConvert("myqueue");


    
}
