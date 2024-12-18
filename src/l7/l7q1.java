package l7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class l7q1 {
    public static void main(String[] args) {
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            outputStream.writeUTF("WXES1116,Programming I\n");
            outputStream.writeUTF("WXES1115,Data Structure\n");
            outputStream.writeUTF("WXES1110,Operating System\n");
            outputStream.writeUTF("WXES1112,Computing Mathematics I\n");
            outputStream.close();

            System.out.println("Enter course Code");
            Scanner scanner = new Scanner(System.in);
            String input=scanner.nextLine();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while(true){
                String[] course= inputStream.readUTF().split(",");
                if(input.equals(course[0])){
                    System.out.printf("Course name: %s\n",course[1]);
                }
            }

        }catch(EOFException e){
            System.out.println("Course not found");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
