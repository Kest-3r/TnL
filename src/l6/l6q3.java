package l6;

import java.util.Arrays;

public class l6q3 {
    //Write a Java method that accepts an array of 10 integers. The method should reverse
    //the integer in the array. Example, if the number is 1234, the number will change to
    //4321.
    public static void reverse(int[] array){
        for(int i=0,j= array.length-1; i<=array.length/2-2; i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println((Arrays.toString(array)));
    }
}
