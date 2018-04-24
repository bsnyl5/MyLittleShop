package com.example.mylittleshop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
    private int id;
    private String name;
    private int emp_id;


}
