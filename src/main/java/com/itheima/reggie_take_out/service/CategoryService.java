package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * Class Name: CategoryService
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/29 14:20
 * @Version 1.0
 */

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
