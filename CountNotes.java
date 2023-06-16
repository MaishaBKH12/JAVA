import java.util.*;
import java.lang.*;
//. Write a program that will breakdown the amount and count notes for any given amount.
// Here is the notes in the given array:
public class CountNotes {
    public static void main(String[] args) {
        System.out.println("Enter Amount : ");
        Scanner amount= new Scanner(System.in);
        int a = amount.nextInt();
        a =  countCurrency(a);

    }
        public static int countCurrency(int amount)
        {
            int[] notes = new int[]{ 1000,500,200,100,50,20,10,5,2,1 };
            int[] noteCounter = new int[9];

            // count notes using Greedy approach
            for (int i = 0; i < 9; i++) {
                if (amount >= notes[i]) {
                    noteCounter[i] = amount / notes[i];
                    amount = amount % notes[i];

                }

            }
            System.out.println("Currency Count ->");
            for (int i = 0; i < 9; i++) {
                if (noteCounter[i] != 0) {
                    System.out.println(notes[i] + " : "
                            + noteCounter[i]);
                }
            }
            return amount;
        }



    }

