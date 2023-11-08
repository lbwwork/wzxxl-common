package com.wzxxl.common.enums;

/**
 * @Author libaowen
 * @Date 2023/11/7 14:00
 * @Version 1.0
 */
public enum MessageTypeEnum {

    TEXT("text", "普通文本消息"),
    ONLINE("online", "用户上线数据");

    private String type;

    private String typeDesc;

    MessageTypeEnum(String type, String typeDesc) {
        this.type = type;
        this.typeDesc = typeDesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
