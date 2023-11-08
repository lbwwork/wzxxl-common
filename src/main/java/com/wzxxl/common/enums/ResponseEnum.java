package com.wzxxl.common.enums;

/**
 * @Author libaowen
 * @Date 2023/11/7 14:00
 * @Version 1.0
 */
public enum ResponseEnum {

    SUCCESS(200, "操作成功"),
    FAILED(500, "服务器异常");

    private int code;

    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
