package com.example.mylittleshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

    private int id;
    private String name;
    private String password;
    boolean isOwner;

    @Id
    @Column(name = "emp_id",nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
    @Column(name = "emp_name",length = 20,nullable = false)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column(name = "emp_password", length = 16, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOwner(boolean owner ){
        this.isOwner = owner;
    }

    public boolean isOwner() {
        return isOwner;
    }

    @Override
    public String toString()  {
        if(isOwner())
        return "["+ this.name+","+ this.password+",Manager]";
        else
            return "["+ this.name+","+ this.password+",Employee]";
    }
}
