package Viva1;
import java.util.Scanner;
public class Viva1Q3 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int inp_num= sc.nextInt();

        //prime number route
       if(primeCheck(inp_num)){
            System.out.println(inp_num);
            System.out.println("Integer is a prime number");
       }
       //non prime number route
       else{
            System.out.println("Integer is not a prime number, it has "+numFac(inp_num)+" factors.");
            System.out.println("The factors of this integer are:");
            //list factors
            for (int i = 1; i < inp_num+1; i++) {
               if (inp_num % i == 0) {
                   System.out.print(i);
                   if(i == inp_num)break;
                   System.out.print(", ");
               }
            }
            System.out.print("\n");
            System.out.print("The sum of the factors is ");
            System.out.print(sumFac(inp_num)+"\n");
            //overflow
            if(overflowCheck(inp_num)){
                System.out.println("The product of the factors is too large to display");
            }
            else{
                System.out.println("The product of the factors is "+prodFac(inp_num));
            }
            //perfect number
            if(perfectCheck(inp_num)){
            System.out.println(inp_num+" is a perfect number");
            }else{
            System.out.println(inp_num+" is not a perfect number");
            //list prime number
            System.out.print("Prime numbers between 2 and "+inp_num+": ");
            for (int i = 2; i < inp_num+1; i++) {
                if (primeCheck(i)) {
                    boolean first=true;
                    if(first) {
                        System.out.print(i);
                        first=false;
                    }
                    System.out.print(", ");
                    System.out.print(i);
                }
            }
            System.out.print("\n");

       }
   }
}



    public static int numFac(int num){
       int numFac=0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                numFac++;
            }
        }
        return numFac;
    }

    public static int sumFac(int num){
        int sum=0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static int prodFac(int num){
        int product=1;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                product= product*i;
            }
        }
        return product;
    }

    //return true when prime
    public static boolean primeCheck(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
       return true;
    }


   //return true when perfect
    public static boolean perfectCheck(int num){
        int sum = 0 ;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum == num;
    }

    public static boolean overflowCheck(int inp_num) {
        long product = 1;
        boolean overflow = false;
        for (long i = 1; i < inp_num + 1; i++) {
            if (inp_num % i == 0) {
                try{
                    //attempt to trigger overflow
                    Math.multiplyExact(product, i);
                }catch(ArithmeticException e){
                    overflow = true;
                }
            }
        }
        return overflow;
    }
}
