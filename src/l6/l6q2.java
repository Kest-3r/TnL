package l6;

public class l6q2 {
    //Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then,
    //write a Java program to use the method to display the triangles and diamonds.

    public static void multiPrint(int n,char c){
        for(int i=1;i<=n;i++){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        //triangle
        System.out.println("Triangle");
        for(int i=1;i<=5;i++){
            multiPrint(i,'*');
            System.out.println();
        }
        System.out.println();

        //diamond
        System.out.println("Diamond");
        //upper half
        for(int i=1,j =4;i<=5;i=i+2,j--){
            multiPrint(j,' ');
            multiPrint(i,'*');
            System.out.println();
        }
        //bottom half
        for(int i=5,j =2;i>=1;i=i-2,j++){
            multiPrint(j,' ');
            multiPrint(i,'*');
            System.out.println();
        }
    }
}
