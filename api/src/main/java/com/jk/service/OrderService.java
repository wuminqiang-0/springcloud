package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(name = "provider")
public interface OrderService {



}
