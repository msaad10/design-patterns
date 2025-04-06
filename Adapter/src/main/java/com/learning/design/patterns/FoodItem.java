package com.learning.design.patterns;

public class FoodItem implements Item {
    @Override
    public String getItemName() {
        return "Food Item";
    }

    @Override
    public String getPrice() {
        return "10.00";
    }

    @Override
    public String getRestaurantName() {
        return "Restaurant Name";
    }
}
