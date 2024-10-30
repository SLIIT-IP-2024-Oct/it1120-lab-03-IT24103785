import java.util.Scanner;
public class IT24103785Lab3Q1A {

    public static void main(String[] args) {
        //price = price of 1Kg of rice
        //amount = amount of killograms that you want to buy
        double price,amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1Kg of rice : ");
        price = input.nextDouble();
        System.out.print("Enter the number of Killograms you want to buy : ");
        amount = input.nextDouble();
        double total = price * amount;

        //"\n" is skipping a line necessarry
        System.out.println("\nThe total amount is: " + total);
        }

}



