package com.daniel;

public class shirt extends item {
    public float price;
    String desc;

    @Override
    public void displayPrice() {
        System.out.println("This item costs: " + price);
    }

    @Override
    public void displayDesc() {
        System.out.println("Description: " + desc);
    }
    shirt(float tPrice, String tDesc) {
        price = tPrice;
        desc = tDesc;
    }
}
