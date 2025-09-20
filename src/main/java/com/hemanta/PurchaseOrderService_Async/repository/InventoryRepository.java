package com.hemanta.PurchaseOrderService_Async.repository;

import com.hemanta.PurchaseOrderService_Async.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {}
