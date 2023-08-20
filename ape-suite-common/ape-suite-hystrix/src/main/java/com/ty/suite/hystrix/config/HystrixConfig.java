package com.ty.suite.hystrix.config;

import com.ty.suite.hystrix.DoHystrixPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixConfig {

    @Bean
    public DoHystrixPoint doHystrixPoint() {
        return new DoHystrixPoint();
    }
}
