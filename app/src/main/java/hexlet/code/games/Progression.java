package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Progression {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_SIZE_OF_PROGRESSION = 6;
    private static final int EXTRA_SIZE_OF_PROGRESSION = 5;

    public static void play(Scanner console) {
        Engine.welcome(console);

        int seed;
        int step;
        int size;
        int blank;
        int answer;
        int correctAnswer = 0;
        String message = "";

        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < Engine.GAME_ROUNDS; ++j) {
            seed = Engine.getRandomIntegerNumber() % MAX_NUMBER;
            step = Engine.getRandomIntegerNumber() % MAX_NUMBER;
            size = Math.abs(Engine.getRandomIntegerNumber()) % MIN_SIZE_OF_PROGRESSION + EXTRA_SIZE_OF_PROGRESSION;
            blank = Math.abs(Engine.getRandomIntegerNumber()) % size;

            for (int i = 0; i < size; ++i) {
                if (i == blank) {
                    message += ".. ";
                    correctAnswer = seed + i * step;
                } else {
                    message +=  seed + i * step;
                    message += " ";
                }

            }
            Engine.question(message);

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
            message = "";
        }

        Engine.congrats();
    }
}
