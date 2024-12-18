package t7;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class t7q1 {
//    Write statements for each of the following
//    a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
//    public static void main(String[] args) {
//        try {
//            PrintWriter writer = new PrintWriter(new FileOutputStream("integer.txt"));
//            Random random = new Random();
//            for(int i=0;i<10;i++){
//                writer.println(random.nextInt(0,1001));
//            }
//            writer.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//    b. Read from the text file generated in a. Display all the integer and the largest
//    integer.
//    public static void main(String[] args) {
//        try{
//            Scanner scanner = new Scanner(new FileInputStream("integer.txt"));
//            int b=0;
//            while(scanner.hasNext()){
//                int a = scanner.nextInt();
//                if(a>b) b=a;
//                System.out.println(a);
//            }
//            System.out.printf("Largest integer %d",b);
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//    c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
//        public static void main(String[] args) {
//            try {
//                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("integer.dat"));
//                Random random = new Random();
//                for (int i = 0; i < 10; i++) {
//                outputStream.writeInt(random.nextInt(0, 1001));
//                }
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    d. Read from the binary file generated in a c. Display the all the integer and the
//    average.
//    public static void main(String[] args) {
//        double sum = 0;
//        double average = 0;
//        int num=0;
//        try {
//            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("integer.dat"));
//            for (int i = 0; i < 10; i++) {
//                num = inputStream.readInt();
//                System.out.print(num + " ");
//                sum += num;
//            }
//            inputStream.close();
//        }catch(FileNotFoundException e){
//
//        }catch(IOException e){
//
//        }
//        average = sum/10;
//        System.out.println("\nThe average of the 10 numbers is: " + average);
//    }
}