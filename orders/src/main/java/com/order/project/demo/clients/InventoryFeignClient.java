package com.order.project.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory", path = "/inventory")
public interface InventoryFeignClient {
    @GetMapping("/core/hello")
    String hello();
}
