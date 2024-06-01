package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Even {
    public static void play(Scanner console/*, String name*/) {
        Engine.welcome(console);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int round = Engine.GAME_ROUNDS;
        String answer;
        String correctAnswer;
        int number;

        while (round-- > 0) {
            number = Engine.getRandomIntegerNumber(); /*randomNumber.nextInt();*/
            correctAnswer = number % 2 == 0 ? "yes" : "no";

            Engine.question("" + number);

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
