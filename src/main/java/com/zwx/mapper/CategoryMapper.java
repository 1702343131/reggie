package com.zwx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwx.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 张文旭
 * @create 2022/7/26 14:07
 * @description：
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
