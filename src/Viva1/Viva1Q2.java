package Viva1;
import java.util.Scanner;

public class Viva1Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n, a and b: ");

        int n = sc.nextInt();

        int a = sc.nextInt();

        int b = sc.nextInt();

        int steps = 0;

        while (n != 1 && n > 0) {

            if (n % b == 0 && (n / b < n - a || n == b)) {

                n /= b;

            }

            else {

                n -= a;

            }

            steps++;

        }

        if (n == 1) {

            System.out.println(steps);

        }

        else {

            System.out.println(-1);

        }

        sc.close();

    }

}
