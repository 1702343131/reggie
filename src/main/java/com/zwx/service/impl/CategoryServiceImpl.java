package com.zwx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zwx.common.CustomException;
import com.zwx.entity.Category;
import com.zwx.entity.Dish;
import com.zwx.entity.Setmeal;
import com.zwx.mapper.CategoryMapper;
import com.zwx.service.CategoryService;
import com.zwx.service.DishService;
import com.zwx.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张文旭
 * @create 2022/7/26 14:08
 * @description：
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;
    @Override
    public void remove(Long id) {

        LambdaQueryWrapper<Dish> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(lambdaQueryWrapper);
        if (count > 0) {
            throw new CustomException("当前分类下关联个菜品,不能删除");
        }

        LambdaQueryWrapper<Setmeal> lambdaQueryWrapper1 = new LambdaQueryWrapper<>();
        lambdaQueryWrapper1.eq(Setmeal::getCategoryId,id);
        int count1 = setmealService.count(lambdaQueryWrapper1);
        if (count1 > 0) {
            throw new CustomException("当前分类下关联个菜品,不能删除");
        }

        super.removeById(id);

    }
}
