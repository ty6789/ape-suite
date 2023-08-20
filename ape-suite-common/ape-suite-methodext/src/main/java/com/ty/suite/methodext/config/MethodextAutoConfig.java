package com.ty.suite.methodext.config;

import com.ty.suite.methodext.DoMethodExtPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MethodextAutoConfig {

    @Bean
    public DoMethodExtPoint doMethodExtPoint() {
        return new DoMethodExtPoint();
    }
}
