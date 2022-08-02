package com.zwx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwx.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 张文旭
 * @create 2022/7/14 19:25
 * @description：
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
