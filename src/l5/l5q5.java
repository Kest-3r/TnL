package l5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class l5q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        System.out.println("A list of 20 random integer within 0 to 100");

        for(int i=0;i<=19;i++){
            array[i] = rd.nextInt(0,101);
        }
        System.out.println(Arrays.toString(array));

        for(int pass=0;pass <= array.length -1;pass++) {
            for (int i = 0; i <= array.length - 1 - 1; i++) {
                int hold = array[i];
                if (array[i] < array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = hold;
                }
            }
        }
        System.out.println("Array in descending order:");
        System.out.println(Arrays.toString(array));

        System.out.print("Enter number to search: ");
        int checkNum=sc.nextInt();

        int lSLoopCount=0;
        for(int i:array){
            if(checkNum==i) {
                System.out.println(i);
                break;
            }
            lSLoopCount++;
        }
        System.out.println("Linear search - "+lSLoopCount);

        int bNLoopCount=0;
        int high = array.length-1,middle = 0,low=0;
        while(low<=high){
            middle = (low+high)/2;
            if(array[middle]==checkNum) break;
            else if(checkNum<array[middle]) high = middle-1;
            else if(checkNum>array[middle]) low = middle+1;
            bNLoopCount++;
        }
        System.out.println("Binary search - "+bNLoopCount);
    }
}
