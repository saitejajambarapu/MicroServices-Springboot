package com.inventory.project.inventory.controller;

import com.inventory.project.inventory.clients.OrdersFeignClient;
import com.inventory.project.inventory.serviceImpl.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/core")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestClient restClient;

    @Autowired
    private OrdersFeignClient ordersFeignClient;

    @GetMapping("/check")
    public String check(){
//        ServiceInstance inventory  = discoveryClient.getInstances("orders").getFirst();
        //String res = restClient.get().uri(inventory.getUri()+"/orders/core/hello").retrieve().body(String.class);
        String res = ordersFeignClient.hello();
        return res;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello From Inventory";
    }

}
