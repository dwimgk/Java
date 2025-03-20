import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        File textFile = new File("D:\\Java\\FileEditor\\Zadacha.txt");
        try{
            Scanner fileScanner = new Scanner(textFile);
            while(fileScanner.hasNextLine()){
                text.append(fileScanner.nextLine());
                text.append("\n");
            }
            fileScanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        Scanner inputScanner = new Scanner(System.in);

        boolean running = true;
        while(running){
            System.out.println("What do you wish to do? ");
            String input = inputScanner.nextLine();
            String[] words = input.split(" ");
            switch(words[0]){
                case "print":
                    System.out.println(text);
                    break;
                case "concat":
                    for(int i = 1; i < words.length; i++){
                        text.append(words[i] + " ");
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input: " + input);
                    break;
            }
        }
        inputScanner.close();

        try (FileWriter writer = new FileWriter(textFile)) {
            writer.write(String.valueOf(text));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}