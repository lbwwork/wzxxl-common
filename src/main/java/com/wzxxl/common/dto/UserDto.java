package com.wzxxl.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author libaowen
 * @Date 2023/11/7 10:58
 * @Version 1.0
 */
@Data
public class UserDto {

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Long id;

    /**
     * 用户账号
     */
    @ApiModelProperty("用户账号")
    private String account;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;
}
