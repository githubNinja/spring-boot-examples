package com.spring.bootexamples.controller;

import com.spring.bootexamples.component.CacheComponent;
import com.spring.bootexamples.request.PayloadCartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@ConditionalOnProperty(name = "spring.profiles.active", havingValue = "qual")
public class CartController {
    private List<String> cartItems;

    @Autowired
    private CacheComponent cacheComponent;

    @GetMapping("/cart/items")
    public List<String> getCartItems() {
        cartItems = new ArrayList<>();
        cartItems.add("hammer");
        cartItems.add("paint");
        cartItems.add("couch");
        return cartItems;
    }

/*
    public List<String> getCartItems() {
        cartItems = new ArrayList<>();
        cartItems.add("hammer");
        cartItems.add("paint");
        cartItems.add("couch");
        return cartItems;
    }
*/


    @GetMapping("/cart/invokeCache/{cacheValue}")
    public String getValueFromCacheEndpoint(@PathVariable String cacheValue) {
        System.out.println("is my method invoked !!!" + cacheValue);
        return cacheComponent.getCacheValue(cacheValue);
    }

    @GetMapping("/cart/invokeNonCache/{cacheValue}")
    public String getMyName(@PathVariable String cacheValue) {
        System.out.println("getMyName:::" + cacheValue);
        return "Hello " + cacheValue;
    }

    @PostMapping(value = "/cart/postItem")
    public String postItem(@RequestBody PayloadCartItem payloadCartItem) {
        return "200";
    }
}
