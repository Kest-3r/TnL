package l4;

import java.util.Random;

public class l4q8 {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(0,101);
        System.out.println("Random Number: "+n);
        int numPrime=0;
        boolean firstWord=true;
        for(int i=1;numPrime<n;i++){
            if(primeCheck(i)) {
                if (firstWord) {
                    System.out.print(i);
                    firstWord = false;
                } else System.out.print(", " + i);
                numPrime++;
            }
        }
    }
    public static boolean primeCheck(int i){
        for (int j = 2; j < i; j++){
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
