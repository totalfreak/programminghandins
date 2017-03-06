package com.daniel;

public class Main {

    public static void main(String[] args) {
        //First tread
        Thread t1 = new Thread(new Stuff(0));
        //Second thread
        Thread t2 = new Thread(new Stuff(0));

        //Starting the threads
        t1.start();
        t2.start();

    }


}
