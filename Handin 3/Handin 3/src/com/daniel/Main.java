package com.daniel;
import java.util.*;

public abstract class Main {

    public abstract void update();

    public int number;
    public String wham;
    public String soManyVariables = "Too many";
    public boolean isThisEvenRealLife;
    private char benisLength = '9';
    public boolean areAllTheseVariablesEvenNecessary = false;
    public boolean isLarsTheCoolestTeacher = true;
    String theseVariableNamesAreGettingOutOfHand;
    private int amountOfVariables = 10;


    static List<Main> listOfMains = new ArrayList<Main>();


    public static void main(String[] args) {
        System.out.println(multiply(2,2,2));
        doThings();
    }

    public static void doThings() {
        listOfMains.add(new subClass1());
        listOfMains.add(new subClass2());
        listOfMains.add(new subSubClass1());

        for(int i = 0; i< listOfMains.size(); i++)
            listOfMains.get(i).update();
    }

    public static int multiply(int x, int y, int z) {
        return x*y*z;
    }

    public static double multiply(double x, double y, double z) {
        return x*y*z;
    }
}
