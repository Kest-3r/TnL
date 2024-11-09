package l4;

import java.util.ArrayList;
import java.util.Scanner;

public class l4q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non negative number: ");
        int num = scanner.nextInt();
        int digit = 0;
        for(int i = 1;num%10!=0;num/=10,digit=i,i++);
        System.out.printf("DIgit: %d",digit);
    }
}
