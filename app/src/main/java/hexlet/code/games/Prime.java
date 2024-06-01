package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Prime {
    public static void play(Scanner console) {
        Engine.welcome(console);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int number;
        String answer;
        String correctAnswer;
        int dividers = 0;

        for (int j = 0; j < Engine.GAME_ROUNDS; ++j) {
            correctAnswer = "yes";
            number = Math.abs(Engine.getRandomIntegerNumber()) % 100 + 2;

            for (int i = 2; i < number / 2; ++i) {
                if (number % i == 0) {
                    //System.out.println(i);
                    correctAnswer = "no";
                    break;
                }
            }

            Engine.question(number + "");

            answer = Engine.answer(console);

            if (answer.equals(correctAnswer)) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, correctAnswer);
                return;
            }
        }

        Engine.congrats();
    }
}
