package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.entity.User;
import com.itheima.reggie_take_out.mapper.UserMapper;
import com.itheima.reggie_take_out.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * Class Name: UserServiceImpl
 * Description:
 *
 * @Author 原常乐
 * @Create 2024/1/1 11:20
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
