package com.hemanta.PurchaseOrderService_Async.controller;

import com.hemanta.PurchaseOrderService_Async.entity.Inventory;
import com.hemanta.PurchaseOrderService_Async.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryService.save(inventory);
    }

    @GetMapping("/{id}")
    public Inventory get(@PathVariable Long id) {
        return inventoryService.getById(id);
    }

    @GetMapping
    public List<Inventory> getAll() {
        return inventoryService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        inventoryService.delete(id);
    }
}
