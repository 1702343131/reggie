package com.zwx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zwx.entity.Employee;
import com.zwx.mapper.EmployeeMapper;
import com.zwx.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author 张文旭
 * @create 2022/7/14 19:26
 * @description：
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
