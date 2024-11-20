package l6;
import java.util.Random;
import java.util.Scanner;
public class l6q5 {
    //Write a Java method that accepts three parameters, the method will compare whether
    //the third parameter value is equal to the multiplication of parameter 1 and parameter
    //2. Then, write a Java multiplication game for any random number within 0 – 12.

    public static boolean compare(int a,int b,int c){
        return c==a*b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd=new Random();
        int input=1,score=0;
        while(true){
            int a=rd.nextInt(13);
            int b=rd.nextInt(13);
            System.out.println("Enter a negative number to quit");
            System.out.printf("%d * %d = ",a,b);
            input = scanner.nextInt();
            if(input<0) break;
            else if(compare(a,b,input)){
                score++;
            }
        }
        System.out.println("Your score is "+score);
    }
}
