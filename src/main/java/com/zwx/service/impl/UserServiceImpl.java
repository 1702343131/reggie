package com.zwx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zwx.entity.User;
import com.zwx.mapper.UserMapper;
import com.zwx.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
