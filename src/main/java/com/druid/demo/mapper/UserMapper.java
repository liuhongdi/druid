package com.druid.demo.mapper;

import com.druid.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User selectOneUserByUsernamePassword(String username,String password);
    User selectOneUserByUsernamePassword2(String username,String password);
}