package com.zwx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwx.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}