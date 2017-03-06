package com.daniel;

public class Stuff implements Runnable{

    int y;
    public Stuff(int x) {
        y = x;
    }

    @Override
    public void run() {
        try  {
            while(y <= 3) {
                System.out.println(y);
                y++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
