package t5;

import java.util.Scanner;

public class t5q4 {
    public static void main(String[] args) {
        //Write the statements that display the number of occurrence of the word "the"
        //(case sensitive) in a string array name sentence.

        String[] array ={"word","h","word","case","fun"};
        int counter=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals("word") ){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
