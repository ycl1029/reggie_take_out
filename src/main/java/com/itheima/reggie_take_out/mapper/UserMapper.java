package com.itheima.reggie_take_out.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie_take_out.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Class Name: UserMapper
 * Description:
 *
 * @Author 原常乐
 * @Create 2024/1/1 11:19
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
