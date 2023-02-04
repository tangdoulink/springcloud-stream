package com.zpb.stream.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

/**
 * @author       pengbo.zhao
 * @description  消费者-服务
 * @createDate   2022/4/8 16:48
 * @updateDate   2022/4/8 16:48
 * @version      1.0
 */
@Slf4j
@Service
public class ConsumerService {

    /**
     * 函数式编程接收消息
     * @return message
     */
    @Bean
    public Consumer<Message> sms(){
        return message -> log.info("消费消息: {}",message);
    }

    @Bean
    public Consumer<Object> error(){
        return message -> log.info("error错误: {}",message);
    }

    // @Bean
    // public Consumer<Object> errorChannel(){
    //     return message -> log.info("errorChannel错误订阅: {}",message);
    // }



}
