import java.util.Scanner;
public class ShippingCost {
    public static void main (String[]args){
        double itemPrice = 0;
        double totalPrice = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of your item.");
        itemPrice = in.nextDouble();

        if (itemPrice < 100){
            double shippingCost = itemPrice * 0.02; //Calculating 2% of the price user entered
            totalPrice = itemPrice + shippingCost; //shipping cost is added to item for grand total
            System.out.println("Your shipping cost for $"+itemPrice+ " is $"+shippingCost);
            System.out.println("Your total price is $"+totalPrice);
        }
        else{
            totalPrice = itemPrice;
            System.out.println("You have free shipping!");
            System.out.println("Your total cost for the item is $"+totalPrice);
        }


    }
}
