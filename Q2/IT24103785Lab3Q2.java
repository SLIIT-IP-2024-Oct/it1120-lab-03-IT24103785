import java.util.Scanner;
public class IT24103785Lab3Q2 {

    public static void main(String[] args) {
        //inputs-monthlySalary,OThrs,hourlyRates
        double monthlySalary,OThrs,hourlyRate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
         monthlySalary = input.nextDouble();
        System.out.print("Enter the no of OT hours: ");
         OThrs = input.nextDouble();
        System.out.print("Enter the OT hourly rate: ");
         hourlyRate = input.nextDouble();
        double OTpay = OThrs * hourlyRate;
        double totalPay = monthlySalary + OTpay;
        System.out.println("\nThe total salary including OT is: " + totalPay);
    }
}