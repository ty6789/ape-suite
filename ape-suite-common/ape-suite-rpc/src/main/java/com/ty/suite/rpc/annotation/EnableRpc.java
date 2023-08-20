package com.ty.suite.rpc.annotation;

import com.ty.suite.rpc.config.ServerAutoConfiguration;
import com.ty.suite.rpc.config.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({ServerAutoConfiguration.class})
@EnableConfigurationProperties(ServerProperties.class)
@ComponentScan("com.ty.suite.*")
public @interface EnableRpc {

}
