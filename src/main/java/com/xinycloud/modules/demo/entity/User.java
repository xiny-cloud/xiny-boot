package com.xinycloud.modules.demo.entity;

/**
 * @author caozl
 * @version 1.0
 * @date 2020-02-13
 */
public class User {
    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
