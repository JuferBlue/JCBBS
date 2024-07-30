package com.jxufe.controller.admin;

import com.jxufe.pojo.dto.AdminLoginDTO;
import com.jxufe.pojo.entity.Admin;
import com.jxufe.pojo.result.Result;
import com.jxufe.pojo.vo.AdminLoginVO;
import com.jxufe.service.AdminService;
import com.jxufe.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@Api(tags = "管理员接口")
public class AdminController {
    @Autowired
    private AdminService adminService;


    /**
     * @description:
     * @author: JuferBlue
     * @date: 2024/7/31 0:03
     * @param:adminLoginDTO
     * @return: Result<AdminLoginVO>
     **/
    @ApiOperation(value = "管理员登录")
    @PostMapping("/login")
    public Result<AdminLoginVO> login(@RequestBody AdminLoginDTO adminLoginDTO){
        log.info("管理员登录：{}" , adminLoginDTO);

        Admin admin  = adminService.login(adminLoginDTO);

        //登录成功后，生成jwt令牌
        Map<String, Object> claims = new HashMap<>();
        claims.put("account", admin.getAccount());
        String token = JwtUtil.createJWT( claims);
    }
}
