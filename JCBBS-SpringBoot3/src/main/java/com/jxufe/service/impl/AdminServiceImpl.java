package com.jxufe.service.impl;

import com.jxufe.exception.AccountNotFoundException;
import com.jxufe.mapper.AdminMapper;
import com.jxufe.pojo.dto.AdminLoginDTO;
import com.jxufe.pojo.entity.Admin;
import com.jxufe.service.AdminService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.service.impl
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  00:07
 * @Description: 管理员接口服务层
 * @Version: 1.0
 */
@CommonsLog
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin login(AdminLoginDTO adminLoginDTO) {
        String account = adminLoginDTO.getAccount();
        log.info("管理员登录账号："+account);
        String password = adminLoginDTO.getPassword();
        //1.根据账号查询数据库中信息
        Admin admin = adminMapper.selectByAccount(account);
        //2.处理异常情况
        if(admin==null){
            //账号不存在
            throw new AccountNotFoundException("账号不存在");
        }

        //3.返回实体对象
        return admin;
    }
}
