package com.example.debugrabbitmq.rabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接受者
 * @author chrelyonly
 */
@Component
@RabbitListener(queues = "hello")
@Slf4j
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        log.info("消费者2收到消息  : " + hello);
    }
}
