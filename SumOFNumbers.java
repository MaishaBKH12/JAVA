import java.util.Scanner;
public class SumOFNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        do {
            System.out.println("Enter a number: ");
            input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (true);

        System.out.println("The sum of numbers is " + sum);
    }
}


