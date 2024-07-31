package com.jxufe.service.impl;

import com.jxufe.constant.MessageConstant;
import com.jxufe.exception.AccountNotFoundException;
import com.jxufe.exception.PasswordErrorException;
import com.jxufe.mapper.AdminMapper;
import com.jxufe.pojo.dto.AdminLoginDTO;
import com.jxufe.pojo.entity.Admin;
import com.jxufe.service.AdminService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

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
            throw new AccountNotFoundException(MessageConstant.Account_Not_Found);
        }
        //密码加密比对
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        log.info("加密后的密码："+password);
        if(!password.equals(admin.getPassword())){
            throw new PasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }

        //3.返回实体对象
        return admin;
    }
}
