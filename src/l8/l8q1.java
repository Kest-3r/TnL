package l8;

import java.util.Arrays;
import java.util.Random;

public class l8q1 {
    //Define a class name Number. The class is used to handle an integer array. The class
    //Number will display all the item of the array, the even number, the prime number, the
    //maximum number, the minimum number, the average, the square number. Create a
    //Tester class to test the program.
    //Number a = new Number() // generate 10 random integers within 0 to 100.
    //Number b = new Number(5) // generate 5 random integers within 0 to 100.
    //Number c = new Number(4, 50) // generate 4 random integers within 0 to 50.

    public class Number{
        public int[] num;
        Random random = new Random();
        public Number(){
            for(int i=0;i<10;i++){
            this.num[i] = random.nextInt(0,101);
            }
        }
        public Number(int a){
            for(int i=0;i<a;i++){
                this.num[i] = random.nextInt(0,101);
            }
        }
        public Number(int a,int b){
            for(int i=0;i<a;i++){
                this.num[i] = random.nextInt(0,b+1);
            }
        }
        public void displayAllNumber(){
            System.out.print(Arrays.toString(this.num));
        }
        public void displayEven(){
            for(int i:this.num){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        public void displayPrime(){
            for(int i:this.num){
                boolean isPrime=false;
                for(int j=2;j<i;j++)
                    if(i%j==0){
                        isPrime =true;
                        break;
                    }
                if(isPrime){
                    System.out.print(i+" ");
                }
            }
        }
        public void displayMaximum(){
            int max=0;
            for(int i:this.num){
                if (max<i){
                    max=i;
                }
            }
            System.out.printf("Max: %d",max);
        }
        public void displayMinimum(){
            int min=0;
            for(int i:this.num){
                if (min>i){
                    min=i;
                }
            }
            System.out.printf("Min: %d",min);
        }
        public void displayAverage(){
            double sum=0;
            for(int i:this.num){
                sum+=i;
            }
            double avg = sum/this.num.length;
            System.out.printf("Avg: %-6.2f",avg);
        }
        public void displaySquareNum(){
            for(int i:this.num){
                int x = (int) Math.sqrt(i);
                if(Math.pow(x,2) == i){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
