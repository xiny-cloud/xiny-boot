package com.xinycloud.modules.demo.mapper;

import com.xinycloud.modules.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author caozl
 * @version 1.0
 * @date 2020-02-13
 */
@Mapper
public interface UserMapper {
    @Select("select * from sys_user where id = #{id}")
    User getById(String id);
}
