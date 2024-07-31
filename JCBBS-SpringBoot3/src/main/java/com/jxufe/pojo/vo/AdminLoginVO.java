package com.jxufe.pojo.vo;


import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "管理员登录时返回的数据模型")
public class AdminLoginVO {
    @Schema(description = "管理员id")
    private Long id;
    @Schema(description = "管理员账号")
    private String account;
    @Schema(description = "管理员登录token")
    private String token;
}
