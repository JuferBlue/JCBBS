package com.jxufe.exception;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  10:33
 * @Description: 业务异常
 * @Version: 1.0
 */
public class BaseException extends RuntimeException{
    public BaseException() {}
    public BaseException(String message) {
        super(message);
    }
}
