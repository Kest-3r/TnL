package l7;

import java.io.*;
import java.util.Arrays;

public class l7q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:/Users/keste/IdeaProjects/TnL/Lab07/person.dat"));
            int recordNum = inputStream.readInt();
            String[][] record = new String[recordNum][3];
            //store dataset
            for (int i = 0; i < recordNum; i++) {
                record[i][0] = inputStream.readUTF();
                record[i][1] = String.format("%d",inputStream.readInt());
                record[i][2] = String.format("%c",inputStream.readChar());
            }
            //sort by name
            for (int i = 0; i < recordNum; i++) {
                for (int j = 0; j < recordNum-1; j++){
                    if(letterCompare(record,j)){
                        String temp_Name = record[j][0];
                        String temp_Age = record[j][1];
                        String temp_Gender = record[j][2];
                        record[j][0] = record[j+1][0];
                        record[j][1] = record[j+1][1];
                        record[j][2] = record[j+1][2];
                        record[j+1][0] = temp_Name;
                        record[j+1][1] = temp_Age;
                        record[j+1][2] = temp_Gender;
                    }

                }
            }

            //Display record
            System.out.println("Name\t\t\t\t\t\tAge\t  Gender");
            for (int i = 0; i < recordNum; i++) {
                System.out.printf("%-20s\t\t%-3s\t\t%s\n",record[i][0], record[i][1],record[i][2]);
            }

        }catch(FileNotFoundException e){
            System.out.print("File not found");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //true: first word higher in ASCII
    public static boolean letterCompare(String[][] record,int i){
        String name1 = record[i][0].replace(" ","").toLowerCase();
        String name2 = record[i+1][0].replace(" ","").toLowerCase();

        return name1.compareTo(name2)>0;
    }
}