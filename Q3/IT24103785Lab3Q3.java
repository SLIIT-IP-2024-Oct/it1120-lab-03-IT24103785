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
        //amount1 is updated amount
        amount1 = amount - notes1 * 5000;
        //1000 Notes = notes2
        notes2 = amount1/1000;
        //amount2 is updated amount
        amount2 = amount1 - notes2 * 1000;
        //500 Notes = notes3
        notes3 = amount2/500;
        //amount3 is updated amount
        amount3 = amount2 - notes3 * 500;
        //200 Notes = notes4
        notes4 = amount3/200;
        //amount4 is updated amount
        amount4 = amount3 - notes4 * 200;
        //100 Notes = notes5
        notes5 = amount4/100;
        //amount5 is updated amount
        amount5 = amount4 - notes5 * 100;
        //50 Notes = notes6
        notes6 = amount5/50;
        //amount6 is updated amount
        amount6 = amount5 - notes6 * 50;
        //20 Notes = notes7
        notes7 = amount6/20;
        //amount7 is updated amount
        amount7 = amount6 - notes7 * 20;
        //10 Coins = coins1
        coins1 = amount7/10;
        //amount8 is updated amount
        amount8 = amount7 - coins1 * 10;
        //5 Coins = coins2
        coins2 = amount8/5;
        //amount9 is updated amount
        amount9 = amount8 - coins2 * 5;
        //2 Coins = coins3
        coins3 = amount9/2;
        //amount10 is updated amount
        amount10 = amount9 - coins3 * 2;
        //1 Coins = coins4
        coins4 = amount10;
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