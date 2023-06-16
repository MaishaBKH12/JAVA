
import java.lang.String;
//"A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?

public class CalculatePrice {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // Extract the digits from the paragraph
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        String laptopPrice = paragraph.substring(paragraph.indexOf("85000") + 5, paragraph.indexOf("tk") + 2);
        String mousePrice;
        mousePrice = paragraph.substring(paragraph.indexOf("2500") + 5, paragraph.indexOf("tk") + 2);

        // Calculate the total price
        int laptopPriceInt = Integer.parseInt(laptopPrice);
        int mousePriceInt = Integer.parseInt(mousePrice);
        int totalPrice = laptopPriceInt + mousePriceInt;

        // Calculate the discount
        int discountPercentage = 15;
        int discountAmount = (totalPrice * discountPercentage) / 100;

        // Calculate the final price
        int finalPrice = totalPrice - discountAmount;

        System.out.println("The final price is " + finalPrice + " tk");
    }
}