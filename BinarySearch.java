import java.util.Arrays;
import static java.util.Arrays.binarySearch;

public class BinarySearch{
    //Write a program that will find your key is found in the given array using binary search method
    //numbers=[1,6,9,3,5,4,7]
    //key=5
    public static void main(String[] args) {
        {

            int intArr[ ] = {1,6,9,3,5,4,7 };
            Arrays.sort(intArr);
            int intKey = 5;
            System.out.println(intArr);
            System.out.println("Sorted Array is given below : ");
            for (int num : intArr) {

                System.out.print( num+" " );
            }

            System.out.println(
                    intKey + "\n"+"Key found at index = "
                            + Arrays.binarySearch(intArr, 1, 6, intKey));

        }
    }

        }


