package com.jxufe;

import com.jxufe.config.properties.JwtProperties;
import com.jxufe.constant.JwtClaimsConstant;
import com.jxufe.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  10:55
 * @Description: TODO
 * @Version: 1.0
 */
@CommonsLog
@SpringBootTest
public class adminTest {
    @Autowired
    private JwtProperties jwtProperties;
    @Test
    public void testJwt() {
        //登录成功后，生成jwt令牌
        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.ADMIN_ID, 1);
        String token = JwtUtil.createJWT(
                jwtProperties.getAdminSecretKey(),//密钥
                jwtProperties.getAdminTtl(),//有效期
                claims//负载
        );
        log.info("jwt令牌：" + token);
        Claims cla = JwtUtil.parseJWT(jwtProperties.getAdminSecretKey(), token);
        log.info(cla);
        log.info(cla.get("adminId"));
        log.info(cla.get("exp"));
    }
}
