import java.util.Scanner;

public class Palindrome { //Check if the given string is palindrome or not.
    // Palindrome means after reversing a string, it will be same

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();

        boolean isPalindrome = str.equals(reversedStr);

        // Print the result
        if (isPalindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


