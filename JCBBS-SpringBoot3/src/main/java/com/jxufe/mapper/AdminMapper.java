package com.jxufe.mapper;

import com.jxufe.pojo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where account = #{account}")
    Admin selectByAccount(String account);
}
