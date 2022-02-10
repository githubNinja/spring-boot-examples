package com.spring.bootexamples.configuration;

import com.spring.bootexamples.interceptor.RequestHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("interceptor is invoked !!!");
        registry.addInterceptor(new RequestHandlerInterceptor()).addPathPatterns("/cart/**");

    }

}
