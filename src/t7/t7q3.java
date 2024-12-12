package t7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class t7q3 {
    //Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.
    public static void main(String[] args) {
        try {
            PrintWriter w = new PrintWriter(new FileOutputStream("data.txt"));
            String sentence = "Hi";
            String ascii = "";

            for (int i = 0; i < sentence.length(); i++) {
                char letter = sentence.charAt(i);
                ascii += String.format("%08d", Integer.parseInt(Integer.toBinaryString(letter)));
            }

            w.print(ascii);
            w.close();
        } catch (IOException e) {
            System.out.println("The file cannot be written.");
        }

        try {
            Scanner scanner = new Scanner(new FileInputStream("data.txt"));

            int code = 0;
            String num = "";

            while (scanner.hasNextLine()) {

                num += scanner.next();
            }

            System.out.println(num);
            String wholeSentence = "";
            for (int i = 0; i < num.length(); i += 8) {
                code = 0;
                for (int j = i, z = 7; j < i + 8; j++, z--) {
                    code += Integer.parseInt(String.valueOf(num.charAt(j))) * Math.pow(2, z);
                }
                char print = (char) code;
                wholeSentence += print;
            }

            System.out.println(wholeSentence);

            scanner.close();
        } catch (IOException e) {
            System.out.println("File is not available");
        }
    }
}
