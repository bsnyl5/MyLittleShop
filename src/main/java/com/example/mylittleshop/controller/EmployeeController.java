package com.example.mylittleshop.controller;

import com.example.mylittleshop.entity.Account;
import com.example.mylittleshop.entity.Employee;
import com.example.mylittleshop.entity.Shop;
import com.example.mylittleshop.repository.EmployeeRepository;
import com.example.mylittleshop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ShopRepository shopRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<List<Employee>>(employeeRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "shop/{id}", method = RequestMethod.GET)
    public List<Employee> shop(@PathVariable("id") Long id, Model model) {
        Shop shop = shopRepository.findById(id).get();
        return employeeRepository.findByShop(shop);
    }

}
