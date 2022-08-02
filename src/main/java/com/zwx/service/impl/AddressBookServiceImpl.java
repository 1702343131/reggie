package com.zwx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zwx.entity.AddressBook;
import com.zwx.mapper.AddressBookMapper;
import com.zwx.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
