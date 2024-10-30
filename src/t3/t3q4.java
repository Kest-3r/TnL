package t3;
import java.util.Scanner;

public class t3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();
        System.out.print("Enter number: ");
        int y = sc.nextInt();
        System.out.print("Enter number: ");
        int z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("Largest number: " + x);
        }
        else if(y>z && y>x){
            System.out.println("Largest number: " + y);
        }
        else{
            System.out.println("Largest number: " + z);
        }
    }
}
