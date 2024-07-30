package com.jxufe.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.pojo.dto
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  23:56
 * @Description: 管理员前端请求登录封装的类
 * @Version: 1.0
 */
@Data
@ApiModel(description = "管理员登录请求时传递的数据模型")
public class AdminLoginDTO implements Serializable {
    @ApiModelProperty(value = "管理员账号")
    private String account;
    @ApiModelProperty(value = "管理员密码")
    private String password;
}
