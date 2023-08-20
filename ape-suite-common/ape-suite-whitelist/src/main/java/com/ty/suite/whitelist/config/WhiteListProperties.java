package com.ty.suite.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("ty.suite.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
