package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class GCD {
    public static void play(Scanner console) {
        Engine.welcome(console);

        System.out.println("Find the greatest common divisor of given numbers.");

        int firstNumber;
        int secondNumber;
        int correctAnswer = -1;
        int answer = 0;

        for (int i = 0; i < Engine.GAME_ROUNDS; ++i) {
            firstNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);
            secondNumber = Math.abs(Engine.getRandomIntegerNumber() % 100);

            Engine.question(firstNumber + " " + secondNumber);

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
