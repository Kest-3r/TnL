package test;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_run {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[19];
        for(int i = 0;i < array.length;i++){
            array[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for(int pass = 0;pass < array.length;pass++){
            for(int i = 0;i < array.length-1;i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int low=0,high=array.length-1,middle,key=28,answer=0;

        while(low<=high){
            middle = (low + high) / 2;
            if(key==array[middle]) {
                answer = middle;
                break;
            }
            else if(key<array[middle]){
                high = middle-1;
            }
            else if(key>array[middle]){
                low = middle+1;
            }
        }
        System.out.println("Key index:"+ answer);

    }



}
