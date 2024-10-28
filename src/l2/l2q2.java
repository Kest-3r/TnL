package l2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class l2q2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        double price = 0, downPayment = 0 , rateInterest = 0, year = 0, monthly_payment = 0;

        price = show("Enter the price of car: ");
        downPayment = show("Enter the down payment of the car:  ");
        rateInterest = show("Enter the interest rate: ");
        year = show("Enter the loan duration in year: ");


        monthly_payment = (price - downPayment) * ( 1+ rateInterest * year /100 )/(year*12);
        System.out.println("The monthly payment for your car is: "+ df.format(monthly_payment));
    }

    static double show(String output){
        System.out.print(output);
        return scanner.nextDouble();
    }
}