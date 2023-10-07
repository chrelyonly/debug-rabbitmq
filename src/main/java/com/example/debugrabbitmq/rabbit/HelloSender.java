package com.example.debugrabbitmq.rabbit;

import cn.hutool.core.date.DateUtil;
import com.example.debugrabbitmq.config.MyConst;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * 发送者,生产者
 * @author chrelyonly
 */
@Component
@RequiredArgsConstructor
public class HelloSender {

    private final AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + DateUtil.now();
        this.rabbitTemplate.convertAndSend(MyConst.EXCHANGE_NAME,"", context);
    }
}
