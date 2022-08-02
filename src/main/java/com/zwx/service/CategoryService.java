package com.zwx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwx.entity.Category;

/**
 * @author 张文旭
 * @create 2022/7/26 14:08
 * @description：
 */
public interface CategoryService extends IService<Category> {

    void remove(Long id);
}
