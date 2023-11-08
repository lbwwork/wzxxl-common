package com.wzxxl.common.dto;

import lombok.Data;

/**
 * @Author libaowen
 * @Date 2023/11/7 14:05
 * @Version 1.0
 */
@Data
public class MessageDto {

    /**
     * 人员id
     */
    private Long userId;

    /**
     * 信息
     */
    private String message;

    /**
     * 消息类型
     */
    private String messageType;

    /**
     * 目标
     */
    private String target;
}
