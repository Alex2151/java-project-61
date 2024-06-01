package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.InputMismatchException;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = choise(console);

        switch (number) {
            case 1:
                Engine.welcome(console);
                break;
            case 0:
                Engine.goodbuy();
                break;
            case 2:
                Even.play(console);
                break;
            case 3:
                Calc.play(console);
                break;
            case 4:
                GCD.play(console);
                break;
            case 5:
                Progression.play(console);
                break;
            case 6:
                Prime.play(console);
                break;
            default:
                break;
        }

        console.close();
    }

    public static int choise(Scanner console) {
        int enteredNumber = -1;

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
                case 1:
                    //return enteredNumber;
                case 0:
                    //return enteredNumber;
                case 2:
                    //return enteredNumber;
                case 3:
                    //return enteredNumber;
                case 4:
                    //return enteredNumber;
                case 5:
                    //return enteredNumber;
                case 6:
                    return enteredNumber;

                default:
                    System.out.println("You entered the WRONG number.\nTry again!");
            }
        } while (true);
    }
}
