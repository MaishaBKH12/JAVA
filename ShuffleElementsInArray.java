import java.util.Random;
import java.util.Arrays;
public class ShuffleElementsInArray {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        randomize(arr, n);
    }
        public static void randomize ( int arr[], int n)
        {
            // Creating a object for Random class
            Random r = new Random();

            for (int i = n - 1; i > 0; i--) {

                // Pick a random index from 0 to i
                int j = r.nextInt(i + 1);

                // Swap arr[i] with the element at random index
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            // Prints the random array
            System.out.println(Arrays.toString(arr));
        }

    }


