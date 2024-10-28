package l2;

import java.util.Scanner;

public class l2q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds : ");
        int second = sc.nextInt();

        int hour = second/3600;
        int temp = second%3600;
        int minutes = temp/60;
        temp = temp%60;
        int secondLeft = temp;

        System.out.println(second + " is " + hour + " hours, "+ minutes + " minutes and "+ secondLeft + " seconds ");
    }
}