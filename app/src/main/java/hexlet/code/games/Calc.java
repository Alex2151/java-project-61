package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
//import java.lang.Integer;
//import java.lang.Math;

public class Calc {
    public static void play(Scanner console) {
        Engine.welcome(console);

        System.out.println("What is the result of the expression?");

        int firstNumber;
        int secondNumber;
        int forSign;
        String sign;
        int correctAnswer;
        int answer = 0;

        for (int i = 0; i < Engine.GAMEROUNDS; ++i) {
            firstNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);
            secondNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);
            forSign = Engine.getRandomIntegerNumber() % 3;
            if (forSign == 0) {
                sign = "+";
                correctAnswer = firstNumber + secondNumber;
            } else if (forSign == 1) {
                sign = "-";
                correctAnswer = firstNumber - secondNumber;
            } else {
                sign = "*";
                correctAnswer = firstNumber * secondNumber;
            }

            Engine.question();
            System.out.println(firstNumber + " " + sign + " " + secondNumber);

            String temp = null;
            try {
                temp = Engine.answer(console);
                answer = Integer.parseInt(temp);
            } catch (NumberFormatException ex) {
                Engine.wrongAnswer(temp, correctAnswer);
                return;
            }

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
