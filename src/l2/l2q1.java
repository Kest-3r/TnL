package l2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class l2q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double celsius, fahrenheit;

        System.out.print("Enter the temperature in fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32)/1.8;
        System.out.println("The temperature in celsius is : "+ df.format(celsius) + "°C");

    }
}