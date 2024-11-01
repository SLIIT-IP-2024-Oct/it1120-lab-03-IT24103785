import java.util.Scanner;
public class IT24103785Lab3Q3 {

    public static void main(String[] args) {

        int amount,amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8,amount9,amount10,notes1,notes2,notes3,notes4,notes5,notes6,notes7,coins1,coins2,coins3,coins4;//Notes,Coins

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Rupee amount: ");

        //amount is total amount         
        amount = input.nextInt();

        //5000 Notes = notes1
        notes1 = amount/5000;

        //updated amount
        amount = amount % 5000;

        //1000 Notes = notes2
        notes2 = amount/1000;

        //updated amount
        amount = amount % 1000;

        //500 Notes = notes3
        notes3 = amount/500;

        //updated amount
        amount = amount % 500;

        //200 Notes = notes4
        notes4 = amount/200;

        //updated amount
        amount = amount % 200;

        //100 Notes = notes5
        notes5 = amount/100;

        //updated amount
        amount = amount % 100;

        //50 Notes = notes6
        notes6 = amount/50;

        //updated amount
        amount = amount % 50;

        //20 Notes = notes7
        notes7 = amount/20;

        //updated amount
        amount = amount % 20;

        //10 Coins = coins1
        coins1 = amount/10;

        //updated amount
        amount = amount % 10;

        //5 Coins = coins2
        coins2 = amount/5;

        //updated amount
        amount = amount % 5;

        //2 Coins = coins3
        coins3 = amount/2;

        //updated amount
        amount = amount % 2;

        //1 Coins = coins4
        coins4 = amount;

	//Output
        System.out.println("5000 Notes - " + notes1);
        System.out.println("1000 Notes - " + notes2);
        System.out.println("500 Notes - " + notes3);
        System.out.println("200 Notes - " + notes4);
        System.out.println("100 Notes - " + notes5);
        System.out.println("50 Notes - " + notes6);
        System.out.println("20 Notes - " + notes7);
        System.out.println("10 Coins - " + coins1);
        System.out.println("05 Coins - " + coins2);
        System.out.println("02 Coins - " + coins3);
        System.out.println("01 Coins - " + coins4);
    }        
}
