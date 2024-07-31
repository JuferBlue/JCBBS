package com.jxufe.exception;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  16:15
 * @Description: TODO
 * @Version: 1.0
 */
public class PasswordErrorException extends BaseException{
    public PasswordErrorException() {}
    public PasswordErrorException(String message) {
        super(message);
    }
}
