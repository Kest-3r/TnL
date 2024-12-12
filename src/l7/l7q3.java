package l7;

import java.io.*;
import java.util.Scanner;

public class l7q3 {
    public static void main(String [] args) {
        try{
            Scanner scanner = new Scanner(new FileInputStream("data1.txt"));
            PrintWriter w = new PrintWriter(new FileOutputStream("reverse.txt"));

            while(scanner.hasNextLine()){
                String temp = scanner.nextLine();
                String reverse ="";
                for(int i = temp.length()-1; i>=0; i--){
                    reverse+=temp.charAt(i);
                }
                w.write(reverse + "\n");
            }

            scanner.close();
            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}