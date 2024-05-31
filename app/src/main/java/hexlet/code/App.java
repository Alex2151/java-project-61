package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int number = choise();

        //System.out.println("");

        switch (number) {
            case 1:
                Cli.sayHello();
                break;
            case 0:
                System.out.println("Goodbuy, Stranger! =)");
                break;
            default:
                break;
        }
    }

    public static int choise() {
        Scanner console = new Scanner(System.in);
        int enteredNumber = -1;

        do {
            System.out.println("\n" + "Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("0 - Exit");

            System.out.print("Your choise: ");
            enteredNumber = console.nextInt();
            System.out.println("");

            switch (enteredNumber) {
                case 1:
                    return enteredNumber;
                case 0:
                    return enteredNumber;
                default:
                    System.out.println("You entered the WRONG number.\nTry again!");
            }
        } while (true);
    }
}
