package l6;

public class l6q4 {
    //Write a Java method that implements Euclidean Algorithm to return the greatest
    //common divisor of two positive integers. Then, write a program to get the GCD for
    //(24, 8) and (200, 625).

    public static int gcd(int a, int b) {
        int max = Math.max(a, b),min = Math.min(a, b);
        while (min != 0) {
            int temp = min;
            //find remainder
            min = max % min;
            //set to  min divisor
            max = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(24,8));
        System.out.println(gcd(200,625));
    }
}
