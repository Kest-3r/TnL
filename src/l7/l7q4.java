package l7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class l7q4 {
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            int character=0,word=0,line=0;
            while(inputStream.hasNext()){
                String input = inputStream.nextLine();
                String[] array = input.split(" ");
                //add line
                line++;
                //include spaces for character
                character += array.length-1;
                for(int i = 0; i<array.length; i++){
                    //add character line
                    character += array[i].length();
                    //number check
                    try {
                        Integer.parseInt(array[i]);
                    } catch (NumberFormatException e) {
                        //add word
                        word++;
                    }
                }
            }

            System.out.printf(String.format("Character count: %d\n",character));
            System.out.printf(String.format("Word count: %d\n",word));
            System.out.printf(String.format("Line count: %d\n",line));

            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}