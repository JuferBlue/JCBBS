package com.jxufe.exception;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  10:35
 * @Description: 账号未找到异常
 * @Version: 1.0
 */
public class AccountNotFoundException extends BaseException{
    public AccountNotFoundException() {
    }
    public AccountNotFoundException(String message) {
        super(message);
    }
}
