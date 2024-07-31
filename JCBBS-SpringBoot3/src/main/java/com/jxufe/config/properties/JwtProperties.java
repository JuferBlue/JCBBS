package com.jxufe.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.config.properties
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  00:20
 * @Description: jwt令牌的相关配置
 * @Version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {
    /**
     * 管理端生成jwt令牌相关配置
     */
    private String adminSecretKey; //jwt密钥
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用户端用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;
}
