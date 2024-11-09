package l4;
import java.util.Scanner;

public class l4q1 {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.print("Enter an integer:");
            boolean firstNum = true;
            int num = scanner.nextInt();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    if(!firstNum){
                        System.out.print(", ");
                    }else firstNum=false;
                    System.out.print(i);
                }
            }

        }

}
