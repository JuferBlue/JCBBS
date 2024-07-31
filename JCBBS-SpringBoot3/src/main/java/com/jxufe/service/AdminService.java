package com.jxufe.service;

import com.jxufe.pojo.dto.AdminLoginDTO;
import com.jxufe.pojo.entity.Admin;

public interface AdminService {
    /**
     * @description: 管理员登录
     * @author: JuferBlue
     * @date: 2024/7/31 10:05
     * @param: adminLoginDTO
     * @return: Admin
     **/
    Admin login(AdminLoginDTO adminLoginDTO);
}
