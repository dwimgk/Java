import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert to:");
        String input = sc.nextLine();

        NumberParser np = new NumberParser();
        int result = np.parse(input);
        System.out.println(result);
    }
}