package t3;

public class t3q2 {
    public static void main(String[] args){
        //a
        int num1=1,num2=2;
        if (num1 == num2)
            System.out.println("Number 1 is equal to number 2.");

        //b
        int x=0,y=1,z=2;
        if (x > y && x > z)
            System.out.println("x is the largest number");

        //c

        String s1="a", s2="a";
        if (s1.equals(s2))
            System.out.println("They are equal strings.");
        else
        System.out.println("They are not equal strings.");

        //d
        int k=1,j=4;
        if (k>0 || j>0)
        System.out.println("Either x or y is positive");
    }
}
