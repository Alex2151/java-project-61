package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class GCD {
    public static void play(Scanner console) {
        Engine.welcome(console);

        System.out.println("Find the greatest common divisor of given numbers.");

        int firstNumber;
        int secondNumber;
        //int forSign;
        //String sign;
        int correctAnswer = -1;
        int answer = 0;

        for (int i = 0; i < Engine.GAMEROUNDS; ++i) {
            firstNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);
            secondNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);
            /*forSign = Engine.getRandomIntegerNumber() % 3;
            if (forSign == 0) {
                sign = "+";
                correctAnswer = firstNumber + secondNumber;
            } else if (forSign == 1) {
                sign = "-";
                correctAnswer = firstNumber - secondNumber;
            } else {
                sign = "*";
                correctAnswer = firstNumber * secondNumber;
            }*/

            Engine.question(firstNumber + " " + secondNumber);
            //System.out.println(firstNumber + " " + sign + " " + secondNumber);

            String temp = null;
            try {
                temp = Engine.answer(console);
                answer = Integer.parseInt(temp);
            } catch (NumberFormatException ex) {
                Engine.wrongAnswer(temp, correctAnswer);
                return;
            }

            correctAnswer = Engine.greatestComDev(firstNumber, secondNumber);

            if (answer == correctAnswer) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, correctAnswer);
                return;
            }
        }

        Engine.congrats();
    }
}
