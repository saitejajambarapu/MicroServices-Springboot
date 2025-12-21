package com.order.project.demo.repository;

import com.order.project.demo.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Orders,Long> {
}
