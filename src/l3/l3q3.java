package l3;
import java.util.Scanner;

public class l3q3 {

    //commission calculator
    public static double calc_com(int sale_vol,double com_perc){
        return (double) sale_vol*com_perc;
    }

    public static void main(String[] args) {
        int sal_vol;
        double com_perc,commision;
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Input sales volume: ");
        sal_vol = sc.nextInt();

        //set percentage and print
        if(sal_vol<=100){
            com_perc = 5.0;
            commision = calc_com(sal_vol,com_perc);
            System.out.printf("Commision: %5.2f\n",commision);
        }
        else if(sal_vol>200&&sal_vol<=500){
            com_perc = 7.5;
            commision = calc_com(sal_vol,com_perc);
            System.out.printf("Commision: %5.2f\n",commision);
        }
        else if(sal_vol>500&&sal_vol<=100){
            com_perc = 10.0;
            commision = calc_com(sal_vol,com_perc);
            System.out.printf("Commision: %5.2f\n",commision);
        }
        else if(sal_vol>1000){
            com_perc = 12.5;
            commision = calc_com(sal_vol,com_perc);
            System.out.printf("Commision: %5.2f\n",commision);
        }
        else{
            System.out.println("Error");
        }


    }
}



