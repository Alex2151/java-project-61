package hexlet.code.games;

import java.util.Scanner;
//import java.lang.Integer;
//import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void play(Scanner console/*, String name*/) {
        Engine.welcome(console);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int round = Engine.GAMEROUNDS;
        //boolean result = true;
        String answer;
        String correctAnswer;
        //Random randomNumber = new Random();
        int number;

        while (round-- > 0) {
            number = Engine.getRandomIntegerNumber(); /*randomNumber.nextInt();*/
            correctAnswer = number % 2 == 0 ? "yes" : "no";

            //System.out.println("Question: " + number);
            Engine.question("" + number);
            //System.out.println(number);
            //System.out.print("Your answer: ");

            //answer = console.next();
            answer = Engine.answer(console);
            //System.out.print("\n");
            if (answer.equals(correctAnswer)) {
                //++score;
                //System.out.println("Correct!");
                Engine.correctAnswer();
            } else {
                //System.out.print("\n");
                /*System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name + "!");*/
                Engine.wrongAnswer(answer, correctAnswer);
                return;
                //result = false;
            }
        }
        //System.out.println("Congratulations, " + name + "!");
        Engine.congrats();
    }
}
