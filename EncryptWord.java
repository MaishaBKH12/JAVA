import java.util.Scanner;
public class EncryptWord { // Encrypt word: ROADTOSDET

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            // Encrypt the word
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'A') {
                    word = word.replace('A', 'F');
                } else {
                    word = word.replace(word.charAt(i), (char) (word.charAt(i) + 1));
                }
            }

            // Print the encrypted word
            System.out.println("Encrypted word: " + word);
        }
    }

