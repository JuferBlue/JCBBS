package com.jxufe.pojo.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: JCBBS-SpringBoot3
 * @BelongsPackage: com.jxufe.pojo.result
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  23:26
 * @Description: 后端统一向前端返回结果的类
 * @Version: 1.0
 */
@Data
public class Result<T>implements Serializable {
    private Integer code;//状态码 1成功0失败
    private String msg;
    private T data;

    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.code = 1;
        result.data = data;
        return result;
    }

    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.code = 0;
        result.msg = msg;
        return result;
    }

}
