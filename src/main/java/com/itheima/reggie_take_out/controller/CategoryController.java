package com.itheima.reggie_take_out.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie_take_out.common.R;
import com.itheima.reggie_take_out.entity.Category;
import com.itheima.reggie_take_out.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class Name: CategoryController
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/29 14:23
 * @Version 1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public R<String> save(@RequestBody Category category){
        boolean save = categoryService.save(category);
        if (save){
            return R.success("新增分类成功");
        }
        return R.error("新增分类失败");
    }

    @GetMapping("/page")
    public R<Page> page(int page,int pageSize){
        //构建分页对象
        Page<Category> pageInfo = new Page<>(page,pageSize);
        //构建查询条件
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Category::getSort);
        categoryService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);
    }

    @DeleteMapping
    public R<String> delete(Long ids){
        //@PathVariable 只有在uri路径里的{}里的变量存在时才添加
        categoryService.remove(ids);
        return R.success("分类信息删除成功");
    }

    @PutMapping
    public R<String> update(@RequestBody Category category){
        boolean b = categoryService.updateById(category);
        if (b){
            return R.success("分类修改成功");
        }
        return R.error("分类修改失败");
    }

    //新增菜品下拉框显示实现
    @GetMapping("/list")
    //get请求没有请求体 所以实体参数前不加@RequestBody
    public R<List<Category>> list(Category category){
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(category.getType()!=null,Category::getType,category.getType());
        queryWrapper.orderByDesc(Category::getUpdateTime).orderByAsc(Category::getSort);
        List<Category> list = categoryService.list(queryWrapper);
        return R.success(list);

    }
}
