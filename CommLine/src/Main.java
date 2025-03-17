import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! Use 'help' for a list of commands");
        Scanner scanner = new Scanner(System.in);

        InputHandler inputHandler = new InputHandler();
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "exit":
                    scanner.close();
                    return;
                case "print":
                    InputHandler.print();
                    break;
                case "calc": {
                    int first = 0, second = 0;
                    try{
                        first = scanner.nextInt();
                        second = scanner.nextInt();
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Please enter a number");
                        break;
                    }
                    try{
                        System.out.println(inputHandler.calc(first, second));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                }
                    break;
                case "help":
                    inputHandler.help();
                    break;
                default:
                    System.out.println("Invalid input " + input);
                    break;
            }
        }
    }
}