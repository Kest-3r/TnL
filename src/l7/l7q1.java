package l7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class l7q1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        writeFile();

        System.out.print("Please enter the subject code that you want to checked: ");
        String code = scanner.nextLine();

        displayCourseName(code);

    }

    private static void displayCourseName(String code) {
        try{
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while(true){
                String temp = i.readUTF();
                String [] z = temp.split(",");
                if(code.equals(z[0])) {
                    System.out.println("The subject name is: " + z[1]);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(EOFException e){
            System.out.println("Not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("coursename.dat"));

            o.writeUTF("WXES1116,Programming I\n");
            o.writeUTF("WXES1115,Data Structure\n");
            o.writeUTF("WXES1110,Operating System\n");
            o.writeUTF("WXES1112,Computing Mathematics I\n");

            o.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
