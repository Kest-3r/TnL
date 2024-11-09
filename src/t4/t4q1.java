package t4;

public class t4q1 {
    /*
    a. Find the largest integer n so that n^3 is less than 2000.
        double n = 0;
        for (int i = 0; i < 2000; i++) {
            if (Math.pow(i, 3) >= 2000) break;
            n = i;
        }
    b. Display the square number of the first twelve integers starting from 1.
        for(double i =1;i<=12;i++){
            System.out.printf("%d^2 = %d\n",(int)i,(int)(Math.pow(i,2)));
        }
    c. Display a 4-by-5 matrix using random number within 0 to 100.
        Random rd = new Random();
        for(int i = 0;i<=4;i++){
            for(int j = 0;j<=5;j++){
                int n = rd.nextInt(0,101);
                System.out.print(n+"\t");
            }
            System.out.print("\n");
        }
    d. Compute the sum of numbers from 1 to a given number.
        Scanner scanner = new Scanner(System.in);
        int stop_num = scanner.nextInt();
        int sum=0;
        for(int i =1;i<=stop_num;i++){
            int sub_sum=0;
            for(int j=1;j<=i-1;j++){
                sub_sum = sub_sum+j;
            }
            sum = sum + i + sub_sum;
        }
        System.out.println("sum"+sum);
    }
    e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
       double denominator = 25;
       double i = 1;
       double sum = 0;
            for(double denominator = 25;denominator>=1;denominator--){
                sum = sum + i/denominator;
                i++;
            }
       System.out.printf("Sum:%~5.2",sum);
    */
}
