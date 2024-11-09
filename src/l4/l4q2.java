package l4;
import java.util.Scanner;

public class l4q2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter bound: ");
        int num = scanner.nextInt();
        int sum = 0;

        for(int i=1;i<=num;i++){
            int sub_sum=0;
            for(int j=1;j<=i;j++){
                sub_sum=sub_sum+j;
            }
            sum=sum+sub_sum;
        }
        System.out.println(sum);
    }
}
