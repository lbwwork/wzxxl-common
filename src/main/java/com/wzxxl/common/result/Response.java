package com.wzxxl.common.result;

import com.wzxxl.common.enums.ResponseEnum;
import lombok.Data;

/**
 * @Author libaowen
 * @Date 2023/11/8 15:42
 * @Version 1.0
 */
@Data
public class Response<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回值
     */
    private T data;

    /**
     * 返回消息
     */
    private String message;

    private Response (int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static <T> Response<T> success(T data) {
        return new Response<T>(ResponseEnum.SUCCESS.getCode(), data, ResponseEnum.SUCCESS.getMessage());
    }

    public static <T> Response<T> success(T data, String message) {
        return new Response<T>(ResponseEnum.SUCCESS.getCode(), data, message);
    }

    public static <T> Response<T> error(String message) {
        return new Response<>(ResponseEnum.FAILED.getCode(), null, message);
    }

    public static <T> Response<T> error() {
        return new Response<>(ResponseEnum.FAILED.getCode(), null, ResponseEnum.FAILED.getMessage());
    }

}
