package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.InputMismatchException;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
//import hexlet.code.GamesNumber;


public class App {
    static final int EXIT = 0;
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCDEV = 4;
    static final int PROGR = 5;
    static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = choise(console);
        //GamesNumber gamesNumber;

        switch (number) {
            case GREET:
                Engine.welcome(console);
                break;
            case EXIT:
                Engine.goodbuy();
                break;
            case EVEN:
                Even.play(console);
                break;
            case CALC:
                Calc.play(console);
                break;
            case GCDEV:
                GCD.play(console);
                break;
            case PROGR:
                Progression.play(console);
                break;
            case PRIME:
                Prime.play(console);
                break;
            default:
                break;
        }

        console.close();
    }

    public static int choise(Scanner console) {
        int enteredNumber = -1;
        //GamesNumber gamesNumber;

        do {
            System.out.println("\n" + "Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");

            System.out.println("0 - Exit");

            System.out.print("Your choise: ");
            try {
                enteredNumber = console.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please, enter the number!");
                console.nextLine();
                continue;
            }
            System.out.println("");

            switch (enteredNumber) {
                case GREET:
                    //return enteredNumber;
                case EXIT:
                    //return enteredNumber;
                case EVEN:
                    //return enteredNumber;
                case CALC:
                    //return enteredNumber;
                case GCDEV:
                    //return enteredNumber;
                case PROGR:
                    //return enteredNumber;
                case PRIME:
                    return enteredNumber;

                default:
                    System.out.println("You entered the WRONG number.\nTry again!");
            }
        } while (true);
    }
}

/*
public enum GamesNumber {
    EXIT,
    GREET,
    EVEN,
    CALC,
    GCD,
    PROGR,
    PRIME
}
*/
