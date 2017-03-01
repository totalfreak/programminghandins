package com.daniel;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class shop{

    public int level = 0;

    public Scanner sc = new Scanner(System.in);

    public item pants = new pants(10, "Pretty shit pair of pants");
    public item shoes = new shirt(20, "A pretty shit shirt");
    public item shirt = new shoes(15, "A pretty shit pair of shoes");
    public List<item> listOfStuff = new ArrayList<item>();

    public cart cart = new cart();

    shop() {

    }

    public void shopping() {
        switch (level) {
            case 0:
                listOfStuff = new ArrayList<item>();
                listOfStuff.add(pants);
                listOfStuff.add(shoes);
                listOfStuff.add(shirt);
                int index = 1;
                for(item i : listOfStuff) {
                    System.out.print(index+") ");
                    i.displayDesc();
                    i.displayPrice();
                    index += 1;
                }
                System.out.println((listOfStuff.size()+1) + ") Checkout");
                System.out.println("\nEnter a number corresponding to the item you want to put in your cart");
                break;
            case 1:
                listOfStuff = new ArrayList<item>();
                break;
        }
        int choosen = sc.nextInt();
        if(choosen < listOfStuff.size()) {
            cart.add(listOfStuff.get(choosen));
            System.out.println("Items in cart: " + cart.contents.size());
            shopping();
        } else if(choosen == listOfStuff.size()+1) {

            cart.checkout();
        } else {
            System.out.println("Bad number");
            shopping();
        }
    }
}
