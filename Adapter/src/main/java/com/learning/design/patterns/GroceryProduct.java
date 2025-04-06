package com.learning.design.patterns;

public class GroceryProduct implements GroceryItem {
    @Override
    public String getName() {
        return "Grocery Name";
    }

    @Override
    public String getPrice() {
        return "Grocery Price";
    }

    @Override
    public String getStoreName() {
        return "Grocery Store Name";
    }
}
