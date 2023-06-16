public class WithoutTemp { ///Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping the values, a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping the values, a = " + a + " and b = " + b);
    }
}
