package com.zwx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zwx.entity.OrderDetail;
import com.zwx.mapper.OrderDetailMapper;
import com.zwx.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}