package com.example.debugrabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chrelyonly
 */
@Configuration
public class MyRabbitConfig {

    /**
     * 声明交换机
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(MyConst.EXCHANGE_NAME);
    }
    /**
     * 声明队列
     */
    @Bean
    public Queue queue() {
        return new Queue(MyConst.QUEUE_NAME);
    }

    /**
     * 绑定队列到交换机
     */
    @Bean
    public Binding queueBinding(Queue queue,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
}
