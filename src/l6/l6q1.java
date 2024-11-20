package l6;

public class l6q1 {
    //Write a Java method that returns a triangular number. A triangular number is defined
    //as 1+2+3+…+ n. Then, write a Java program to use the method to display the first 20
    //triangular numbers.

    public static int genTri(int n){
        return (n*(n+1))/2;
    }

    public static void display(){
        for(int i = 1;i<=20;i++) {
            System.out.println(genTri(i)+" ");
        }
    }

    public static void main(String[] args) {
        display();
    }
}
