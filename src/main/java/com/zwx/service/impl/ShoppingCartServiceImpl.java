package com.zwx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zwx.entity.ShoppingCart;
import com.zwx.mapper.ShoppingCartMapper;
import com.zwx.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
