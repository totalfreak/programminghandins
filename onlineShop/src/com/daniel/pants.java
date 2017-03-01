package com.daniel;

import static com.daniel.Main.shopCart;

public class pants extends shop implements item{
    float price;
    String desc;
    @Override
    public void add() {
        shopCart.add(this);
    }

    @Override
    public void displayPrice() {
        System.out.println("This item costs: " + price);
    }

    @Override
    public void displayDesc() {
        System.out.println("Description: " + desc);
    }
    pants(float tPrice, String tDesc) {
        price = tPrice;
        desc = tDesc;
    }
}
