package t5;

import java.util.Arrays;
import java.lang.Integer.*;

public class t5q6 {
    //Write the statements that generate 1 random integer within 0 – 255. Convert the
    //number to binary and store the bit into an 8 bit array. Then, display the binary number
    public static void main(String[] args) {
        int num = (int)(Math.random() *256);
        System.out.println("The number is :" + num);
        String [] binary = new String[8];
        String bin = Integer.toBinaryString(num);
        char [] binaryArray = bin.toCharArray();
        System.out.println("Binary number: "+Arrays.toString(binaryArray));

    }
}
