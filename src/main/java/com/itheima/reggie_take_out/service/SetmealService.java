package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.dto.SetmealDto;
import com.itheima.reggie_take_out.entity.Setmeal;

import java.util.List;

/**
 * Class Name: SetmealService
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/29 16:27
 * @Version 1.0
 */
public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void deleteSetmeal(List<Long> ids);

    void updateWithDishes(SetmealDto setmealDto);

    /**
     * 回显套餐数据：根据套餐id查询套餐
     * @return
     */
    SetmealDto getDate(Long id);
}
