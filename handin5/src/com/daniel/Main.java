package com.daniel;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Stuff(0));
        Thread t2 = new Thread(new Stuff(0));
        Thread t3 = new Thread(new Stuff(0));
        Thread t4 = new Thread(new Stuff(0));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}
