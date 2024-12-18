package t7;

import java.io.*;
import java.util.Scanner;

public class t7q3 {
    //Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.
    public static void main(String[] args) {
        try{
            String sentence="HI";
            String ascII="";
            PrintStream outputStream = new PrintStream(new FileOutputStream("data.txt"));
            for(int i=0;i<sentence.length();i++){
                char letter = sentence.charAt(i);
                String binaryLetter=Integer.toBinaryString(letter);
                while(binaryLetter.length()<8){
                    binaryLetter="0"+binaryLetter;
                }
                ascII+=binaryLetter;
            }
            outputStream.print(ascII);
            outputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            Scanner scanner = new Scanner(new FileInputStream("data.txt"));
            String codeSentence="";
            String sentence="";

            while(scanner.hasNext()){
                codeSentence += scanner.next();
            }

            for(int i=0;i<codeSentence.length();){
                String codeWord="";
                for(int j=0;j<8;j++,i++){
                    codeWord += codeSentence.charAt(i);
                }
                sentence += (char)Integer.parseInt(codeWord,2);
            }
            System.out.println(sentence);

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
