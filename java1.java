import java.util.ArrayList;
import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers type 'exit' to finish loop:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter number.");
            }
        }

        System.out.println("All Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
