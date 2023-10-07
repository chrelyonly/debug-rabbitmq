package com.example.debugrabbitmq.controller;

import com.example.debugrabbitmq.rabbit.HelloSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author chrelyonly
 */
@RestController
@RequiredArgsConstructor
public class RabbitMqHelloTest {

    private final HelloSender helloSender;

    @RequestMapping("/hello")
    public void hello() {
        helloSender.send();
    }
}
