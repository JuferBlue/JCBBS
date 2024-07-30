package com.jxufe.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.pojo.vo
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  23:59
 * @Description: 管理员登录时返回的数据模型
 * @Version: 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "管理员登录时返回的数据模型")
public class AdminLoginVO {
    @ApiModelProperty(value = "管理员id")
    private Long id;
    @ApiModelProperty(value = "管理员账号")
    private String account;
    @ApiModelProperty(value = "jwt令牌")
    private String token;
}
