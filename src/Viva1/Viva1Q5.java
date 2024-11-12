package Viva1;
import java.util.Scanner;
public class Viva1Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter REMIX:");
        String input = scanner.nextLine();

        String[] stringArray = input.split("REMIX");
        String sentence = "";

        for(int i=0;i<stringArray.length;i++){
            if(!(stringArray[i].isEmpty())){
                sentence = sentence + stringArray[i]+" ";
            }
        }
        System.out.println(sentence);
    }
}
