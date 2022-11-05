package com.dyl.mapper;

import com.dyl.pojo.User;

import java.util.List;

/**
 * @author ：dyl
 * @date ：Created in 2022/11/4
 * @description：
 */
public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}
