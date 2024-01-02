package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.common.R;
import com.itheima.reggie_take_out.dto.DishDto;
import com.itheima.reggie_take_out.entity.Dish;

/**
 * Class Name: DishService
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/29 16:26
 * @Version 1.0
 */
public interface DishService extends IService<Dish> {

    //新增菜品，需要同时操作两张表 dish dishiflavor
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
