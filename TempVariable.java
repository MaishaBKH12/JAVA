public class TempVariable{
    //Suppose, a=10 and b=20. Now swap the value using a temp variable.
    // Output: a=20, b=10
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping the values : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the values : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
