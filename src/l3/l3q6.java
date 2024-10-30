package l3;
import java.util.Scanner;
public class l3q6 {
    public static void main(String[] args) {
        double radius,x,y,c1=0,c2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter value x: ");
        x = sc.nextDouble();
        System.out.print("Enter value y: ");
        y = sc.nextDouble();

        if((!(x>c1+radius||x<c1-radius))&&(!(y>c2+radius||y<c2-radius))){
            System.out.println("Inside the circle centered at (0,0)");
        }
        else{
            System.out.println("Outside the circle centered at (0,0)");
        }
    }
}
