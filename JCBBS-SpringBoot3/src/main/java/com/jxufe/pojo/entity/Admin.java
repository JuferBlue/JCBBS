package com.jxufe.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.pojo.entity
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  22:16
 * @Description: 用户实体类
 * @Version: 1.0
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private Long id;
    private String account;
    private String password;
    private String name;
    private String studentId;
    private String phone;
    private String email;
    private String avatar;
    private String gender;
    private String createTime;
    private String updateTime;
    private String updateAdminId;
}
