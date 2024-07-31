package com.jxufe.pojo.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "管理员前端请求登录封装的类")
public class AdminLoginDTO implements Serializable {
    @Schema(description = "管理员账号")
    private String account;
    @Schema(description = "管理员密码")
    private String password;
}
