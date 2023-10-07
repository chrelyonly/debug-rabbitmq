package com.example.debugrabbitmq.rabbit;

import com.example.debugrabbitmq.config.MyConst;
import com.example.debugrabbitmq.config.MyRabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接受者 消费者
 * 监听队列，获取队列中的消息
 * @author chrelyonly
 */
@Component
@RabbitListener(queues = MyConst.QUEUE_NAME)
@Slf4j
public class HelloReceiver1 {

    /**
     * 消费者监听队列，获取队列中的消息
     * @param hello 消息
     */
    @RabbitHandler
    public void process(String hello) {
        log.info("消费者1收到消息  : " + hello);
    }
}
