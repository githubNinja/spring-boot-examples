package com.spring.bootexamples.component;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static com.spring.bootexamples.configuration.CacheConfiguration.SPRING_BOOT_CACHING;

@Component
public class CacheComponent {

    public String getCacheComponent() {
        System.out.println("getCacheComponent");
        return "getCacheComponent";
    }

    @Cacheable(SPRING_BOOT_CACHING)
    public String getCacheValue(String cacheValue) {
        System.out.println("Invoked getCacheValue !!!!!!" + cacheValue);
        String s = UUID.randomUUID().toString();
        System.out.println("random UUID::" + s);
        return s;
    }
}
