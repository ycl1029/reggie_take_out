package com.itheima.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie_take_out.entity.OrderDetail;
import com.itheima.reggie_take_out.mapper.OrderDetailMapper;
import com.itheima.reggie_take_out.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * Class Name: OrderDetailServiceImpl
 * Description:
 *
 * @Author 原常乐
 * @Create 2024/1/1 19:53
 * @Version 1.0
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
