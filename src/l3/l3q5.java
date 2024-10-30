package l3;
import java.util.Scanner;

public class l3q5 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter the numbers\n");
        System.out.print("a: ");
        a=sc.nextDouble();
        System.out.print("b: ");
        b=sc.nextDouble();
        System.out.print("c: ");
        c=sc.nextDouble();
        System.out.print("d: ");
        d=sc.nextDouble();
        System.out.print("e: ");
        e=sc.nextDouble();
        System.out.print("f: ");
        f=sc.nextDouble();

        //calculations
        if ((a*d-b*c)!=0){
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.printf("x: %5.2f  y:%5.2f",x,y);
        }
        else if((a*d-b*c)==0){
            System.out.println("the equation has no solution");
        }
        else{
            System.out.println("Error");
        }
    }
}
