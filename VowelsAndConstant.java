public class VowelsAndConstant { //Count number of words, number of characters without spaces,
    // number of vowels and consonant from the given string:

        public static void main(String[] args) {
            String str = "I live in Bangladesh";

            // Count number of words
            int wordCount = str.split(" ").length;

            // Count number of characters without spaces
            int charCount = str.replace(" ", "").length();

            // Count number of vowels
            int vowelCount = 0;
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            // Count number of consonants
            int consonantCount = charCount - vowelCount;

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of chars without spaces: " + charCount);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }
    }

