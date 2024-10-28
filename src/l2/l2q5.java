package l2;

public class l2q5 {
        public static void main(String [] args){
            int num = (int)(Math.random()*10001);
            int sum = 0;

            System.out.println("The random number is: " + num);
            int actualNumber = num;
            while(num > 0){
                int temp = num%10;
                sum+=temp;// sum = sum+temp;
                num = num/10;
            }
            System.out.println("The sum of all the digits of "  + actualNumber + " is : " + sum);
        }
    }

