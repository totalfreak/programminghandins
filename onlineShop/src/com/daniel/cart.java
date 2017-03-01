package com.daniel;

import java.util.ArrayList;
import java.util.List;

public class cart {
    List<item> contents = new ArrayList<item>();
    cart() {

    }

    public void add(item item) {
        contents.add(item);
    }
    public void remove(item item) {
        contents.remove(item);
    }

    public void viewCart(List<item> conts) {
        for(item i : conts) {
            i.displayDesc();
            i.displayPrice();
        }
    }

    public void checkout() {
        System.out.print("Amount of items just bought: " + contents.size());
    }
}
