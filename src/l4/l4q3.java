package l4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class l4q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double input_num = 0;

        ArrayList<Double> numList = new ArrayList<>();
        //prompt input
        for(int i=0;true;i++){
            System.out.print("Enter a score(negative score to quit): ");
            input_num = scanner.nextInt();
            if(input_num<0) break;
            numList.add(input_num);

        }

        double min=Collections.min(numList);
        System.out.printf("Minimum score: %-5.0f\n",min);
        double max=Collections.max(numList);
        System.out.printf("Maximum score: %-5.0f\n",max);

        double sum=0;
        for(int i=0;i<=numList.size()-1;i++){
           sum = sum + numList.get(i);
        }
        double avg=sum/numList.size();
        System.out.printf("Average score: %-5.2f\n",avg);

        double pow2_sum=0;
        for(int i=0;i<=numList.size()-1;i++){
            pow2_sum = pow2_sum + Math.pow(numList.get(i),2);
        }

        double standard_deviation = Math.sqrt( (pow2_sum-(Math.pow(sum,2)/numList.size()))/(numList.size()-1));
        System.out.printf("Standard deviation: %-5.2f",standard_deviation);
    }
}
