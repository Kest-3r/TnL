package l7;

import java.io.*;
import java.util.Arrays;

public class l7q5 {
    public static void main(String [] args){
        String [] nameArr;
        int [] ageArr;
        char [] genderArr;
        int [] indexArr;
        boolean sortable = true;
        int num = 0;

        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("C:\\Users\\user\\IdeaProjects\\Homework\\Lab07\\person.dat"));
            try{
                num = o.readInt();
                nameArr = new String[num];
                ageArr = new int[num];
                genderArr = new char[num];
                indexArr = new int[num];

                for(int i = 0; i<num; i++){
                    nameArr[i] = o.readUTF();
                    ageArr[i] = o.readInt();
                    genderArr[i] = o.readChar();
                }

                o.close();
                for(int i = 0; i< indexArr.length; i++){
                    indexArr[i] = i;
                }

                while(sortable){
                    sortable = false;

                    for(int i = 0 ; i< indexArr.length-1; i++){
                        if(nameArr[indexArr[i]].compareTo(nameArr[indexArr[i+1]]) > 0){
                            int temp = indexArr[i];
                            indexArr[i] = indexArr[i+1];
                            indexArr[i+1] = temp;
                        }
                    }
                }

                for(int i = 0; i< indexArr.length; i++){
                    System.out.printf("%-20s %-3d %s \n", nameArr[indexArr[i]],ageArr[indexArr[i]],genderArr[indexArr[i]]);
                }
            }catch(EOFException e){
                System.out.println("End of file");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}