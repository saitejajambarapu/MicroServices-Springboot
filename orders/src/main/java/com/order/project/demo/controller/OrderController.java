package com.order.project.demo.controller;

import com.order.project.demo.clients.InventoryFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
@RefreshScope
public class OrderController {

    @Value("${my.variable}")
    private String variable;

    @Autowired
    private InventoryFeignClient inventoryFeignClient;

    @GetMapping("/hello")
    public String hello(){
        return "Hello From Orders "+variable;
    }
    @GetMapping("/check")
    public String check(){
        return inventoryFeignClient.hello();
    }
}
