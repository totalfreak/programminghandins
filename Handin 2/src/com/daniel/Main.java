package com.daniel;

import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int points = 0;

    public static void main(String[] args) {
	// write your code here
        quiz();
    }

    public static void quiz() {
        //Making the empty question array
        List<question> questions = new ArrayList<question>();

        //Filling the question array
        questions.add(new question("What is a float?", "A decimal point number", 0));
        questions.add(new question("What is an integer?", "A whole number", 1));
        questions.add(new question("What is string?", "A collection of unicode characters", 2));
        questions.add(new question("What is a char?", "A single unicode character", 3));
        questions.add(new question("What is a byte?", "8 bits of data, small range of numbers", 4));
        questions.add(new question("What is an array?", "A container for other data types", 5));
        questions.add(new question("What is processing?", "A development tool for the processing language", 6));
        questions.add(new question("What is peergrade?", "A peergrading service used by educational institutes", 7));
        questions.add(new question("What is an interface?", "A template that the classes whom implements it have to follow", 8));
        questions.add(new question("What is a long?", "A whole number that can hold a lot of data", 9));
        questions.add(new question("What is ?", "", 10));
        questions.add(new question("What is a?", "", 11));
        questions.add(new question("What is a?", "", 12));
        questions.add(new question("What is a?", "", 13));
        questions.add(new question("What is a?", "", 14));
        questions.add(new question("What is a?", "", 15));
        questions.add(new question("What is a?", "", 16));
        questions.add(new question("What is a?", "", 17));
        questions.add(new question("What is a?", "", 18));
        questions.add(new question("What is a?", "", 19));

        //Choosing a random question to answer, from the array
        int choosenQuestion = (int)Math.floor(Math.random()*questions.size());
        //Getting the chosen question object
        question realQuestion = questions.get(choosenQuestion);
        //Removing it from the array
        questions.remove(choosenQuestion);
        //Making an array to contain the possible answers to the question
        List<question> optionals = new ArrayList<question>();
        //Adding the correct question to the possible answers
        optionals.add(realQuestion);

        //Picking 3 random optional answers
        for(int i = 0; i < 4; i++) {
            int choosen = (int)Math.floor(Math.random()*questions.size());
            optionals.add(questions.get(choosen));
            questions.remove(choosen);
        }
        //Printing the question
        System.out.println(realQuestion.quest);


        //Printing the answers
        for(int i = 0; i < 4; i++) {
            int choosen = (int)Math.floor(Math.random()*optionals.size());
            System.out.println((i+1) + ") " + optionals.get(choosen).answer);
            optionals.get(choosen).id = i+1;
            optionals.remove(choosen);
        }


        System.out.println("Enter an answer between 1-4");
        //Checking if the answer was right or wrong, and reacting accordingly
        if(checkAnswer(sc.nextInt(), realQuestion)) {
            points+=5;
            System.out.println("You're right, you got " + points + " points");
        } else {
            System.out.println("You're wrong, the right answer was " + realQuestion.answer + "\n");
        }

        //Repeating the function call to itself, basically endless quizzing awaits
        quiz();

    }


    //Checking if the written answer is right
    public static boolean checkAnswer(int ans, question answer) {
        boolean right = true;
            if(ans != answer.id) {
                right = false;
            }
        return right;
    }
}
