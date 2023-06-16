import java.text.DecimalFormat;
// Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class Decimal {
    public static void main(String[] args) {
        double d = 15.924567;
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.print(df.format(d));
    }
}
