package com.github.m0levich;

import java.math.BigDecimal;
import java.util.List;

public class Cat {
    private String name;
    private int age;
    private String color;
    private BigDecimal weight;
    private List<String> childrenCat;

    public Cat(String name, int age, String color, BigDecimal weight, List<String> children) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.childrenCat = children;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public List<String> getChildrenCat() {
        return childrenCat;
    }
}
