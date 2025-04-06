package com.learning.design.patterns;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addItem(new FoodItem());
        store.addItem(new FoodItem());

        store.addItem(new GroceryItemAdapter(new GroceryProduct()));

        System.out.println(store.getItems());
    }
}