package com.daniel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int level;

    public static cart shopCart = new cart();


    public static void main(String[] args) {
        shopCart.add(new pants(10, "Pretty shit pair of pants"));

    }



}
