package com.zpb.stream.controller;

import com.zpb.stream.model.Message;
import com.zpb.stream.mq.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author       pengbo.zhao
 * @description  mq-controller
 * @createDate   2022/4/8 17:01
 * @updateDate   2022/4/8 17:01
 * @version      1.0
 */
@Slf4j
@RestController
@RequestMapping("mq")
public class MqController {

    @Resource
    private ProducerService producerService;

    @PostMapping("send")
    public Object sendMessage(@RequestBody Message message){
        return producerService.sendMessage(message);
    }

}
