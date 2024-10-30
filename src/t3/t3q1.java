package t3;
import java.util.Scanner;

public class t3q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a
            int a=27;
            if(3*8==27) {
                System.out.println("1.a. is True");
            }
        //b
            int b;

            b=scanner.nextInt();
            if(b%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        //c
            char c =scanner.next().charAt(0);
            if(Character.isUpperCase(c)){
                System.out.println("Upper");
            }
            else if(Character.isLowerCase(c)){
                System.out.println("Lower");
            }
            else{
                System.out.println("Other");
            }


        //d
            String d="Hello",e="Hobo";
                if(d.compareToIgnoreCase(e)<0){
                    System.out.println("First: "+ d +" Second: " + e);
                }
                else{
                    System.out.println("First: "+ e +" Second: " + d);
                }

        int f = scanner.nextInt();
        switch(f){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
