package com.jxufe.exception;

import com.jxufe.pojo.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  10:31
 * @Description: 全局异常处理器
 * @Version: 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * @description:捕获业务的异常
     * @author: JuferBlue
     * @date: 2024/7/31 10:32
     * @param: ex
     * @return: Result
     **/
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }
}
