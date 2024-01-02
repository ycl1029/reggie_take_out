package com.itheima.reggie_take_out.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie_take_out.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * Class Name: OrderMapper
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/31 19:36
 * @Version 1.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
