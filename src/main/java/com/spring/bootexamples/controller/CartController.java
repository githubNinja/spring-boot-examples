package com.spring.bootexamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {
    public List<String> cartItems = new ArrayList<>();

    @GetMapping("/cart/items")
    public List<String> getCartItems(){
        cartItems.add("hammer");
        cartItems.add("paint");
        cartItems.add("couch");
        return cartItems;
    }
}
