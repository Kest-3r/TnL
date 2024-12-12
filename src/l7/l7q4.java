package l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class l7q4 {
    public static void main(String[] args){
        int countChar = 0, words = 0, lines = 0;
        try(Scanner scanner = new Scanner(new FileInputStream("data1.txt"))){
            while(scanner.hasNextLine()){
                String [] count = scanner.nextLine().split(" ");
                words += count.length;
                for(int i = 0; i<count.length; i++){
                    char [] letter = count[i].toCharArray();
                    countChar+=letter.length;

                }
                countChar+= count.length - 1;

                lines++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Character : " + countChar + "(including spaces)");
        System.out.println("Word: " + words);
        System.out.println("Lines: " + lines);

    }
}