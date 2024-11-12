package t5;

import java.util.Scanner;

public class t5q5 {
    //5. Write the statements that display the string array name sentence in reverse order.
    //Each string element must be displayed in reverse order as well
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String [] word = sentence.split("");
        for(int i = word.length - 1; i>=0; i--){
                System.out.print(word[i]);
        }

    }
}
