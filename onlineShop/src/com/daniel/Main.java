package com.daniel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<item> cart = new ArrayList<item>();


    public static void main(String[] args) {
        new pants(10, "Pretty shit pair of pants").add();
        cart.get(0).displayDesc();
        cart.get(0).displayPrice();
    }



}
