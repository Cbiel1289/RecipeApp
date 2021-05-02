package com.cbiel.recipeapp;

public class FoodData {

    // Values
    private String itemName;
    private String itemDescription;
    private String itemPrice; //later decided this should be time
    private int itemImage;

    // Constructor
    public FoodData(String itemName, String itemDescription, String itemPrice, int itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public int getItemImage() {
        return itemImage;
    }
}

