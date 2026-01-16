package com.inventory.project.inventory.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="orders", path = "/orders", url="${ORDER_SERVICE:}")
public interface OrdersFeignClient {

    @GetMapping("/core/hello")
    String hello();
}
