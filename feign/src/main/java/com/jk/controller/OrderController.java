package com.jk.controller;


import com.jk.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("order")
public class OrderController {


    @Resource
    private OrderService orderService;
















}
