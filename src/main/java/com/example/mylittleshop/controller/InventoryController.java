package com.example.mylittleshop.controller;


import com.example.mylittleshop.entity.Inventory;
import com.example.mylittleshop.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    //Get all inventories
    @GetMapping("/all")
    public Iterable<Inventory> getAllInventories(){
        return inventoryRepository.findAll();
    }
}
