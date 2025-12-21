package com.inventory.project.inventory.repository;

import com.inventory.project.inventory.model.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends CrudRepository<Inventory,Long> {

}
