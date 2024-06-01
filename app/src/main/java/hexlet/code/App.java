package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.InputMismatchException;


public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = choise(console);
        //String name;

        //System.out.println("");

        switch (number) {
            case 1:
                //name = Cli.sayHello(console);
                Engine.welcome(console);
                break;
            case 0:
                //System.out.println("Goodbuy, Stranger! =)");
                Engine.goodbuy();
                break;
            case 2:
                //name = Cli.sayHello(console);
                Even.play(console);
            case 3:
                Calc.play(console);
            default:
                break;
        }

        console.close();
    }

    public static int choise(Scanner console) {
        //Scanner console = new Scanner(System.in);
        int enteredNumber = -1;

        do {
            System.out.println("\n" + "Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");

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
                    return enteredNumber;
                case 0:
                    return enteredNumber;
                case 2:
                    return enteredNumber;
                case 3:
                    return enteredNumber;
                default:
                    System.out.println("You entered the WRONG number.\nTry again!");
            }
        } while (true);
    }
}
