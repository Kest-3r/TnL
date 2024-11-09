package t4;

public class t4q3 {
   /*Write the statements that display the first ten values of the Fibonacci sequence.
   Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2
    int f1=1,f2=1,nextf=0;
        System.out.printf("%d, %d",f1,f2);
        for (int i=0;i<=10-3;i++){
            nextf = f1+f2;
            f1=f2;
            f2=nextf;
            System.out.print(","+nextf);
        }

    */
    public static void main(String[] args) {
        int f1=1,f2=1,nextf=0;
        System.out.printf("%d, %d",f1,f2);
        for (int i=0;i<=10-3;i++){
            nextf = f1+f2;
            f1=f2;
            f2=nextf;
            System.out.print(","+nextf);
        }
    }
}
