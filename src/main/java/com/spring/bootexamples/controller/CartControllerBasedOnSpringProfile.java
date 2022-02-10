package com.spring.bootexamples.controller;

import com.spring.bootexamples.request.PayloadCartItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@ConditionalOnProperty(name = "spring.profiles.active", havingValue = "devl")
public class CartControllerBasedOnSpringProfile {

    private List<String> cartItems;

    @Value("${spring.profiles.active}")
    private String property;


    @GetMapping("/cart/items/test")
    public List<String> getCartItemsTest() {
        System.out.println("property value is:::" + property);
        cartItems = new ArrayList<>();
        cartItems.add("hammer");
        return cartItems;
    }

    @GetMapping("/cart/items/payload")
    public ResponseEntity<String> getCartItemsPayload(PayloadCartItem payloadCartItem) {
        System.out.println("PayloadCartItem is:::" + payloadCartItem);
        return ResponseEntity.ok("SuccessFull");
    }

    @PostMapping(value = "/cart/postItem")
    public String postItemBasedOnSpringProfile(@RequestBody PayloadCartItem payloadCartItem) {
        return "200";
    }

}
