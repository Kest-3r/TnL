package l6;

public class l6q6 {
    public static int reverse(int n){
        int num=0,multiplier=1;
        while (n > 0) {
            num = num*10 + n%10 ;
            n /= 10;
        }
        return num;
    }
    public static boolean primeCheck(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    //Write a Java method that determine whether a number is a palindromic prime and
    //another method that determine whether a number is emirp (the number is a prime
    //number and the reverse also a prime number and is not palindromic prime). Then,
    //write a Java program to use the methods to display the first 20 palindromic prime and
    //emirp

    public static boolean palindromePrimeCheck(int n){
        if(n==1) return false;
        else if(n == reverse(n)){
            return primeCheck(n);
        }
        return false;
    }

    public static boolean emirpCheck(int n){
        if(n!=reverse(n)){
            return primeCheck(n) && primeCheck(reverse(n));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome prime number:");
        int i = 1, counterPalin = 0;
        while (true) {
            if(palindromePrimeCheck(i)){
                counterPalin++;
                System.out.print(i+" ");
            }
            if(counterPalin==20) break;
            i++;
        }
        System.out.println();

        System.out.println("Emirp number:");
        int j = 1, counterEmirp = 0;
        while (true) {
            if(emirpCheck(j)){
                counterEmirp++;
                System.out.print(j+" ");
            }
            if(counterEmirp==20) break;
            j++;
        }
    }
}
