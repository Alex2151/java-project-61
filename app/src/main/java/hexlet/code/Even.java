package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void play(Scanner console, String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int score = 0;
        //boolean result = true;
        String answer;
        String correctAnswer;
        Random randomNumber = new Random();
        int number;

        while (score < 3) {
            number = randomNumber.nextInt();
            correctAnswer = number % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            answer = console.next();
            //System.out.print("\n");
            if (answer.equals(correctAnswer)) {
                ++score;
                System.out.println("Correct!");
            } else {
                //System.out.print("\n");
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name + "!");
                return;
                //result = false;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
