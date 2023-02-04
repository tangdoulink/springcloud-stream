package com.zpb.stream.model;

import lombok.Data;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2022/4/8 17:51
 * @updateDate   2022/4/8 17:51
 * @version      1.0
 */
@Data
public class Message {

    private String topic;

    private String tag;

    private String body;

}
