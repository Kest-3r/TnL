package Viva1;
import java.util.Scanner;
public class Viva1Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] stringArray = input.split("REMIX");
        String sentence = "";
        boolean firstWord=true;

        for(int i=0;i<stringArray.length;i++){
            if(!(stringArray[i].isEmpty())){
                sentence = sentence + stringArray[i];
                if (!firstWord){
                    sentence = sentence + " ";
                }
                firstWord=false;
            }
        }

        System.out.println(sentence);





    }
}
