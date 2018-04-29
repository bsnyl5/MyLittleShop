package com.example.mylittleshop.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.PrinterGraphics;
import java.security.Principal;

@Controller
public class MainController {


    @GetMapping("/")
    String index(Authentication authentication) {
        if(authentication != null){
            //System.out.println(authentication);
            for (GrantedAuthority auth : authentication.getAuthorities()) {
                if ("ROLE_MANAGER".equals(auth.getAuthority())){
                    return "redirect:/admin";
                }
            }
            return "redirect:/employee";
        }
        else return "login";
    }

    @GetMapping("/admin")
    String admin(){
        return "admin";
    }

    @GetMapping("/login")
    String login(){
        return "redirect:/";
    }


}
