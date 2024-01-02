package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Orders;

/**
 * Class Name: OrderService
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/31 19:37
 * @Version 1.0
 */
public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}
