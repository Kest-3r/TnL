package Viva1;

import java.util.Scanner;

public class Viva1Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = scanner.nextInt();

        int sum=0;

        while (n>0) {

            sum+=n%10;

            n/=10;

        }

        while (sum>=10) {

            int sumDigits=0;

            while (sum>0) {

                sumDigits+=sum%10;

                sum/=10;

            }

            sum=sumDigits;

        }

        System.out.println("Sum of digits until single digit: " + sum);

    }

}
