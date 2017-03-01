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
}
