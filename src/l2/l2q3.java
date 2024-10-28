package l2;

import java.text.DecimalFormat;

public class l2q3 {
    public static void main(String [] args){
        DecimalFormat df = new DecimalFormat("0.00");
        int sum;
        double average;

        int num1 = (int)(Math.random() *41 +10);
        int num2 = (int)(Math.random() *41 +10);
        int num3 = (int)(Math.random() *41 +10);

        System.out.println("The three numbers are: " + num1 + ", " + num2 + ", " + num3);

        sum = num1+num2+num3;
        System.out.println("The sum of the three numbers is : " + sum);

        average = (double)sum/3;
        System.out.println("The average of the three numbers is : " + df.format(average));

    }
}