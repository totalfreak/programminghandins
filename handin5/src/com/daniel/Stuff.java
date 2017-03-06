package com.daniel;

public class Stuff implements Runnable{

    //Number variable
    int y;
    public Stuff(int x) {
        //Simply setting the start value, so it can be customized per thread
        y = x;
    }

    @Override
    public void run() {
        try  {
            //Counting to three
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
