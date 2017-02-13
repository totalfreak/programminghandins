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
        List<question> questions = new ArrayList<question>();

        questions.add(new question("What is a float?", "A decimal point number", 0));
        questions.add(new question("What is an integer?", "A whole number", 1));
        questions.add(new question("What is string?", "A collection of unicode characters", 2));
        questions.add(new question("What is a char?", "A single unicode character", 3));
        questions.add(new question("What is a byte?", "8 bits of data, small range of numbers", 4));
        questions.add(new question("What is an array?", "A container for other datatypes", 5));

        int choosenQuestion = (int)Math.floor(Math.random()*questions.size());

        question realQuestion = questions.get(choosenQuestion);
        questions.remove(choosenQuestion);
        List<question> optionals = new ArrayList<question>();
        optionals.add(realQuestion);

        for(int i = 0; i < 4; i++) {
            int choosen = (int)Math.floor(Math.random()*questions.size());
            optionals.add(questions.get(choosen));
            questions.remove(choosen);
        }
        System.out.println(realQuestion.quest);
        for(int i = 0; i < 4; i++) {
            int choosen = (int)Math.floor(Math.random()*optionals.size());
            System.out.println((i+1) + ") " + optionals.get(choosen).answer);
            optionals.get(choosen).id = i+1;
            optionals.remove(choosen);
        }


        System.out.println("Enter an answer between 1-4");
        if(checkAnswer(sc.nextInt(), realQuestion)) {
            points+=5;
            System.out.println("You're right, you got " + points + " points");
        } else {
            System.out.println("You're wrong, the right answer was " + realQuestion.answer);
        }
        quiz();

    }

    public static boolean checkAnswer(int ans, question answer) {
        boolean right = true;
            if(ans != answer.id) {
                right = false;
            }
        return right;
    }
}
