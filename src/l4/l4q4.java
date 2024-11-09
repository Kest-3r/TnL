package l4;

import java.util.Scanner;

public class l4q4 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int year;
        int offSetDay = 0;
        int dayOfMay = 0;
        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 = Sunday, 1 = Monday, ... 6 = Saturday) :");
        day = scanner.nextInt();

        if((year%4==0 && !(year%100==0)) || year%400==0) {
            dayOfMay = day + 2;
            dayOfMay = dayOfMay % 7;
        }
        else{
            dayOfMay = day + 1;
            dayOfMay = dayOfMay & 7;
        }

        for(int offSet = 0; offSet<dayOfMay; offSet++){
            System.out.print("\t");
        }

        offSetDay = dayOfMay + 1;
        for(int i = 1; i<=31;i++){
            System.out.print(i +"\t");
            if(offSetDay%7 == 0) System.out.println("");

            offSetDay++;
        }

        System.out.println("\n\n\n");

        int dayOfAugust = dayOfMay+1;
        offSetDay = 0;
        for(int offSet = 0; offSet<dayOfAugust; offSet++){
            System.out.print("\t");
        }

        offSetDay = dayOfAugust + 1;
        for(int i = 1; i<=31;i++){
            System.out.print(i +"\t");
            if(offSetDay%7 == 0) System.out.println("");

            offSetDay++;
        }
    }
}
