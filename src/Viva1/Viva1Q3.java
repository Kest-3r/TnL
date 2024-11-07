package Viva1;
import java.util.Scanner;
public class Viva1Q3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while(start){
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            //check negative number
            if (num<=0) {
            System.out.println("Please insert a positive number");
        }
            //find prime or not
        else if (primeCheck(num)) {
                System.out.println("Integer is a prime number");
                perfectCheck(num);
            } else if (!primeCheck(num)) {
                System.out.print("Integer is not a prime number");
                numFactor(num);
                listFactorSumProduct(num);
                perfectCheck(num);
                primeList(num);

            } else {
                System.out.println("Error");
            }
        }
    }

    //Check prime
    public static boolean primeCheck(int num){
        if (num <= 1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //Display number of factors
    public static void numFactor(int num){
        int counter = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        counter++;
        System.out.print(",it has "+counter+" factors\n");
    }

    //find factor
    //sum and product of factor
    public static void listFactorSumProduct(int num) {
        lFSP_loop:
        {
            if (num <= 1) {
                System.out.println("The factors of integer are:\n" + num);
                break lFSP_loop;
            }

            long sum=0;
            long product=1;
            boolean overflow=false;
            System.out.println("The factors of integer are:");
            for (long i = 2; i < num / 2; i++) {

                if (num % i == 0) {
                    sum = sum+i;
                    product = product * i;
                    if(product>Long.MAX_VALUE/i){
                        overflow=true;
                    }
                    System.out.print(i+",");
                }
            }
            System.out.print(num+"\n");
            System.out.println("The sum of the factor is "+ sum);
            //Overflow check
            if(overflow) {
                System.out.println("The product of the factors is too large to display");
            }else {
                System.out.println("The product of the factor is " + product);
            }
        }
    }

    //Check perfect
    public static void perfectCheck(int num){
        int sum=0;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num) {
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }
    }

    //List prime
    public static void primeList(int num){
        System.out.print("The prime numbers between 2 and "+num+": ");
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        System.out.print(num+"\n");
    }
}