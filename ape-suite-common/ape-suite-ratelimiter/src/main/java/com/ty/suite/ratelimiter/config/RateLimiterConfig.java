package com.ty.suite.ratelimiter.config;

import com.ty.suite.ratelimiter.DoRateLimiterPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RateLimiterConfig {

    @Bean
    public DoRateLimiterPoint doRateLimiterPoint() {
        return new DoRateLimiterPoint();
    }
}
