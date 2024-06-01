package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
//import java.lang.Integer;
//import java.lang.Math;

public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final int OPERATIONS_COUNT = 3;

    public static void play(Scanner console) {
        Engine.welcome(console);

        System.out.println("What is the result of the expression?");

        int firstNumber;
        int secondNumber;
        int forSign;
        String sign;
        int correctAnswer;
        int answer = 0;

        for (int i = 0; i < Engine.GAME_ROUNDS; ++i) {
            firstNumber = Math.abs(Engine.getRandomIntegerNumber() % MAX_NUMBER);
            secondNumber = Math.abs(Engine.getRandomIntegerNumber() % MAX_NUMBER);
            forSign = Engine.getRandomIntegerNumber() % OPERATIONS_COUNT;
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

            Engine.question(firstNumber + " " + sign + " " + secondNumber);

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
