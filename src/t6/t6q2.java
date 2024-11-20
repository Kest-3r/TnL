package t6;

import java.util.Random;

public class t6q2 {
    //Write a program that consists of a method that can display three numbers in
    //decreasing order
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        Random rd = new Random();
        int rdNum = rd.nextInt(10);
        for (int i = 0; i <= 2; i++) {
            System.out.print(rdNum + " ");
            --rdNum;

        }
    }
}
