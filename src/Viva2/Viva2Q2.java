package Viva2;
import java.util.Scanner;
public class Viva2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Choose the shape to calculate the area: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.printf("The area of the circle is: %.2f\n", calculateCircleArea(radius));
            } else if (choice == 2) {
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("The area of the circle is: " + calculateRectangleArea(length, width));

            } else if (choice == 3) {
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("The area of the circle is: " + calculateTriangleArea(base, height));
            }
            System.out.println();
        }
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }

    public static double calculateRectangleArea(double length, double width) {
        double area = length*width;
        return area;
    }

    public static double calculateTriangleArea(double base, double height) {
        double area = (base*height)/2;
        return area;
    }
}
