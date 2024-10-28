package l2;

import java.util.Scanner;

public class l2q6 {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        int gram = scanner.nextInt();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = scanner.nextDouble();
        initialTemp = (initialTemp - 32) * 5/9;

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = scanner.nextDouble();
        finalTemp = (finalTemp - 32) * 5/9;

        double energy = (gram/1000)*(finalTemp - initialTemp ) * 4184;
        System.out.printf("The energy needed is %e", energy);
    }
}