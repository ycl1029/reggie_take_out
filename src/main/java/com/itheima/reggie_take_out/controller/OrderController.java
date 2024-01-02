package com.itheima.reggie_take_out.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie_take_out.common.R;
import com.itheima.reggie_take_out.entity.Orders;
import com.itheima.reggie_take_out.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Class Name: OrderController
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/31 19:38
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/page")
    public R<Page> page(int page,int pageSize,String name,String beginTime,String endTime){
        Page<Orders> pageInfo  = new Page<>(page,pageSize);
        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name!=null,Orders::getNumber,name);
        //gt:大于 lt:小于  查询这个时间范围的所有订单
        queryWrapper.gt(beginTime!=null,Orders::getOrderTime,beginTime);
        queryWrapper.lt(endTime!=null,Orders::getCheckoutTime,endTime);

        orderService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);

    }

    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        orderService.submit(orders);
        return R.success("下单成功");
    }
}
