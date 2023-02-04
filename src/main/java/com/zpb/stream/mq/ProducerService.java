package com.zpb.stream.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.Message;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

/**
 * @author       pengbo.zhao
 * @description  生产者-服务
 * @createDate   2022/4/8 16:58
 * @updateDate   2022/4/8 16:58
 * @version      1.0
 */
@Slf4j
@Service
public class ProducerService {

    @Resource
    private StreamBridge streamBridge;

    public boolean sendMessage(com.zpb.stream.model.Message message){
        log.info("发送消息：message: {}",message);
        byte[] body = message.getBody().getBytes(StandardCharsets.UTF_8);
        Message messageBody = new Message(message.getTopic(), message.getTag(), body);
        return streamBridge.send(message.getTopic(), messageBody);

    }

}
