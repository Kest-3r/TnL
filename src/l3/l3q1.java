package l3;
import java.util.Scanner;

public class l3q1 {
    public static void main(String[] args){
        int num1,num2;
        char character;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");

        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        num1 = Integer.parseInt(numbers[0]);
        num2 = Integer.parseInt(numbers[1]);

        System.out.print("Enter the operand: ");

        character = sc.nextLine().charAt(0);
        if(character == '+'){
            System.out.println(num1 + " + "+ num2 + " = " + (num1+num2));
        }
        else if(character == '-'){
            System.out.println(num1 + " - "+ num2 + " = " + (num1-num2));
        }
        else if(character == '*'){
            System.out.println(num1 + " * "+ num2 + " = " + (num1*num2));
        }
        else if(character == '/'){
            System.out.println(num1 + " / "+ num2 + " = " + (num1/num2));
        }
        else if(character == '%'){
            System.out.println(num1 + " % "+ num2 + " = " + (num1%num2));
        }
    }
}
