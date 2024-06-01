package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static String userName;
    public static final int GAMEROUNDS = 3;
    private static Random randomNumber = new Random();

    public static void welcome(Scanner console) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = console.next();

        System.out.println("Hello, " + userName + "!");
    }

    public static void goodbuy() {
        System.out.println("Goodbuy, Stranger! =)");
    }

    public static int getRandomIntegerNumber() {
        return randomNumber.nextInt();
    }

    public static void question(String message) {
        System.out.println("Question: " + message);
    }

    public static String answer(Scanner console) {
        System.out.print("Your answer: ");
        return console.next();
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void wrongAnswer(Object answer, Object correctAnswer) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Engine.userName + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int greatestComDev(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }
        return firstNumber + secondNumber;
    }
}
