package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String sayHello(Scanner console) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        //Scanner console = new Scanner(System.in);
        /*if (console.hasNext()) {
            String name = console.next();
            System.out.println("Has read name!");
        } else {
            System.out.println("Got nothing to read!");
        }*/
        String name = console.next();

        System.out.println("Hello, " + name + "!");

        //console.close();
        return name;
    }
}
