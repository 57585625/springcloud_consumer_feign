package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-01")          //服务名称
@Service
public interface CustomersService {

    @RequestMapping("/hello")       //映射该服务下的hello方法
    String hello();
}
