package Viva1;

import java.util.ArrayList;
import java.util.Scanner;

public class Viva1Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr =  new ArrayList<>();

        int largest = Integer.MIN_VALUE;

        int secLargest = Integer.MIN_VALUE;

        int freqLargest = 0;

        int freqSecLargest = 0;

        int sum = 0;

        boolean negativeNum = false;

        System.out.print("Enter numbers: ");

        while (true) {

            int num = sc.nextInt();

            arr.add(num);

            if (num == 0) {

                break;

            }

            if (num < 0) {

                negativeNum = true;

            }

            if (num > largest) {

                secLargest = largest;

                largest = num;

            }

            else if (num > secLargest && num != largest) {

                secLargest = num;

            }

        }





        for (int n: arr) {

            sum += n;

            if (n == largest) {

                freqLargest++;

            }

            else if (n == secLargest) {

                freqSecLargest++;

            }

        }

        System.out.println("The largest number is " + largest);

        System.out.println("The occurrence count of the largest number is " + freqLargest);

        System.out.println("The second-largest number is " + secLargest);

        System.out.println("The occurrence count of the second-largest number is " + freqSecLargest);

        System.out.println("The total sum of all numbers is " + sum);

        if (negativeNum) {

            System.out.println("Negative numbers were entered");

        }

        else {

            System.out.println("No negative number was entered");

        }

    }
}
