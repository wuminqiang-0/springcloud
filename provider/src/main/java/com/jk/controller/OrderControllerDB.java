package com.jk.controller;

import com.jk.service.OrderService;
import com.jk.service.OrderServiceDB;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class OrderControllerDB implements OrderService {

    @Resource
    private OrderServiceDB orderServiceDB;

    /**
     * 账户业务逻辑
     */
    @Override
    @RequestMapping("deduction")
    public void deduction(Integer accountId, Double money) {
        orderServiceDB.deduction(accountId, money);
    }
}
