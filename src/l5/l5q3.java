package l5;

import java.util.Random;
import java.util.Scanner;

public class l5q3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j <= n-1; j++) {

            int[] hours = new int[7];
            int sumHours = 0;

            for (int i : hours) {
                hours[i] = rd.nextInt(1, 9);
                sumHours += hours[i];
            }
            System.out.print("Hours: "+sumHours+"\n");
        }
    }
}
