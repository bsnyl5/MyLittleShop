package com.example.mylittleshop.controller;


import com.example.mylittleshop.entity.Item;
import com.example.mylittleshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    //Get all items
    @GetMapping("/all")
    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
