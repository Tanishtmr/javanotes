import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Continue looping until user inputs "exit"
        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Enter some input (type 'exit' to quit): ");
            input = scanner.nextLine();
            
            if (!input.equalsIgnoreCase("exit")) {
                System.out.println("You entered: " + input);
            }
        }

        System.out.println("Exiting the program...");
        scanner.close();
    }
}
