package com.jxufe.controller.admin;

import com.jxufe.config.properties.JwtProperties;
import com.jxufe.constant.JwtClaimsConstant;
import com.jxufe.pojo.dto.AdminLoginDTO;
import com.jxufe.pojo.entity.Admin;
import com.jxufe.pojo.result.Result;
import com.jxufe.pojo.vo.AdminLoginVO;
import com.jxufe.service.AdminService;
import com.jxufe.utils.JwtUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.controller.admin
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  23:42
 * @Description: 管理员接口
 * @Version: 1.0
 */
@RestController
@RequestMapping("/admin")
@Slf4j
@Tag(name = "管理员接口")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private JwtProperties jwtProperties;

    /**
     * @description:
     * @author: JuferBlue
     * @date: 2024/7/31 0:03
     * @param:adminLoginDTO
     * @return: Result<AdminLoginVO>
     **/
    @Operation(summary = "管理员登录")
    @PostMapping("/login")
    public Result<AdminLoginVO> login(@RequestBody AdminLoginDTO adminLoginDTO){
        log.info("管理员登录：{}" , adminLoginDTO);

        Admin admin  = adminService.login(adminLoginDTO);

        //登录成功后，生成jwt令牌
        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.ADMIN_ID, admin.getId());
        String token = JwtUtil.createJWT(
                jwtProperties.getAdminSecretKey(),//密钥
                jwtProperties.getAdminTtl(),//有效期
                claims//负载
        );

        //封装返回给前端的实体
        AdminLoginVO adminLoginVO = AdminLoginVO.builder()
                .account(admin.getAccount())
                .id(admin.getId())
                .token(token)
                .build();

        return Result.success(adminLoginVO);
    }


}
