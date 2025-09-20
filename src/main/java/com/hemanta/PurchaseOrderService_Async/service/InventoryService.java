package com.hemanta.PurchaseOrderService_Async.service;

import com.hemanta.PurchaseOrderService_Async.entity.Inventory;
import com.hemanta.PurchaseOrderService_Async.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    public Boolean checkProductAvailability(Long productId){
        return true;
    }

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory save(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory getById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }

    public void delete(Long id) {
        inventoryRepository.deleteById(id);
    }

}
