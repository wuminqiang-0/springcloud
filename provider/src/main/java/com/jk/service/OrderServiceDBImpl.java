package com.jk.service;


import com.jk.mapper.OrderMapperDB;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceDBImpl implements OrderServiceDB {


    @Resource
    private OrderMapperDB orderMapperDB;




}
