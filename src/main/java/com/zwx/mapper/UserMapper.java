package com.zwx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwx.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
