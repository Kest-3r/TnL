package t6;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
public class t6q1 {
    /*
    1. Write statements for each of the following
        a. Define a static method that returns the maximum number from 3 integer parameters.
            public static int max(int a,int b,int c){
                int max;
                if(a>b&&a>c) max = a;
                else if(b>a&&b>c) max = b;
                else max =c;
                return max;
            }

        b. Define a static method that determine whether the given integer is a square number.

            public static boolean sqCheck(int num){
                int hold = (int)Math.sqrt((double)num);
                return Math.pow(hold,2)==num;
            }

        c. Define a static method that use to compute combination function C(n,k).
           C(n,k) gives the number of different k-element subsets that can be found in a
           given set of n elements. C(n,k) = n! / (k! (n-k)!
           public static int comb(int n,int k){
                return ((factorial(n)/(factorial(k)*factorial(n-k)));
           }

           public static int factorial(int num){
                int product =1;
                for(int i=1;i<=num;){
                    product *= i;
                }
                return product;
           }

        d. Define a static method that used to determine whether the parameter is a
           pentagonal number. A pentagonal number is a figurate number that extends
           the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)
            public static boolean penCheck(int n){
            double num = 0;
                for(int i =1;i*(3*i-1)/2 <n;i++){
                    double num = i*(3*i-1)/2;
                }
                return num == n;
            }

        e. Define a static method that displays the number of letters and the number of
           digits of a String parameter.
           public static void (String word){
           int letter=0;
           int digit=0;
                for(char c : word.toCharArray()){
                    if(Character.isLetter(c)) letter++;
                    else if(Character.isDigit(c)) digit++;
                }
                System.out.println("Num letter:"+letter);
                System.out.println("Num digit:"+digit);

           }

        f. Define a static void method that generates 10 random numbers within 0 to 100
           to the method’s parameter. The random numbers can be accessed by the main
           method.
           public static void random(int[] array){
                Random rd = new Random();
                for(int i = 0;i<array.length;i){
                    array[i] = rd.nextInt(0,101);
                }
           }

        g. Define a static void method that returns the area and the circumference of a
           circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
           public static void (int[] result,double radius){
                result[0] = 3.14 * Math.pow(radius,2);
                result[1] = 2*3.14*radius;
           }

        h. Define a static method that generate random number within 0 – 10. The
           method will return the first random number that generate twice.
            public static int genRD(){
                Set<Integer> set=new HashSet<>();
                Random random=new Random();
                int rp = 0;
                for(int i =0;i<10;i++){
                    rp = random.nextInt(10);
                    if(set.contains(rp)) break;
                    set.add(rp);
                }
                return rp;
                }

     */
    public static void main(String[] args) {

    }
}
