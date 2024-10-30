import java.util.Scanner;
public class IT24103785Lab3Q1B {

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
        //discount = 10% = 0.1
        double discount = total * 0.1;
        total = total - discount;

        //"\n" for skip a line
        System.out.println("\nThe total amount with 10% discount is: " + total);
        }

}



