package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Progression {
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

        for (int j = 0; j < Engine.GAMEROUNDS; ++j) {
            seed = Engine.getRandomIntegerNumber() % 100;
            step = Engine.getRandomIntegerNumber() % 100;
            size = Math.abs(Engine.getRandomIntegerNumber()) % 6 + 5;
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
/*
            System.out.printf("seed = %d\nstep = %d\nsize = %d\nblank = %d\ncorrectAnswer = %d\n",
                seed, step, size, blank, correctAnswer);
*/
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
