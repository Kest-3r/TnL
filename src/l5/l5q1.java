package l5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class l5q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter number of student: ");
        int[] array = new int[sc.nextInt()];
        //loop random numbers
        int sum=0;
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = rd.nextInt(0,101);
            sum+=array[i];
        }
        //calc avg
        double avg = (double)sum/array.length;
        //check max,min
        double max=0,min=0;
        //sort one index les
        for(int i=0; i<=array.length-1-1; i++) {
            if(array[i]>array[i+1]) max = array[i];
            else if(array[i]<array[i+1]) min = array[i];
        }

        for (int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average: "+avg);
    }
}
