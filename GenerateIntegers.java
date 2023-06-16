import java.util.Random;
//Generate random 10 integer numbers in an array and print out all the numbers
// from array and also print the max and min number from the array
public class GenerateIntegers {
    public static void main(String[] args) {
        int[] val = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Random number array...");
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(50);
            System.out.println(val[i]);
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] < min)
                min = val[i];
            if (val[i] > max)
                max = val[i];
        }
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
    }
}

