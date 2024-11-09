package t4;

public class t4q5 {
    /*Write the statements that display the string in reverse order.
    (use String.length() to get the length of the string)

     */
    public static void main(String[] args){
        String sentence = "I hate life";
        String[] word = sentence.split("");

        for(int i=word.length-1;i>=0;i--){
            System.out.print(word[i]);
        }
    }
}
