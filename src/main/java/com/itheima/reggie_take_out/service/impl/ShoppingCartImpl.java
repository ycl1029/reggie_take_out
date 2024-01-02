package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.entity.ShoppingCart;
import com.itheima.reggie_take_out.mapper.ShoppingCartMapper;
import com.itheima.reggie_take_out.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * Class Name: ShoppingCartImpl
 * Description:
 *
 * @Author 原常乐
 * @Create 2024/1/1 17:38
 * @Version 1.0
 */
@Service
public class ShoppingCartImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
