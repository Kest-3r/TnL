package l4;

import java.util.Scanner;

public class l4q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal=scanner.nextDouble();
        System.out.print("Interest in %: ");
        double interest=scanner.nextDouble();
        System.out.print("Months: ");
        int totalMonths=scanner.nextInt();

        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance\t\tTotal Interest");

        int considerMonth = 0;
        double totalInterest=0;

        for(int i =1;i<=totalMonths;i++){
            considerMonth=i;

            double monthlyPayment = monthlyPayment(principal,interest,totalMonths);
            double duePrincipal = principalDue(monthlyPayment,interest,totalMonths,considerMonth);
            double dueInterest = interestDue(monthlyPayment,duePrincipal);
            double remainingPrincipal = remainingPrincipal(dueInterest,interest,duePrincipal);
            totalInterest = totalInterest +dueInterest;

            System.out.printf("%d\t\t\t%6.2f\t\t\t\t%6.2f\t\t\t%6.2f\t\t\t\t%6.2f\t\t\t\t\t%6.2f\n",considerMonth,monthlyPayment,duePrincipal,dueInterest,remainingPrincipal,totalInterest);
        }

    }

    public static double monthlyPayment(double principal,double interest,int totalMonths){
        return principal*(interest/(1200))/(1-Math.pow((1+interest/1200),-totalMonths));
    }

    public static double principalDue(double monthlyPayment,double interest,int totalMonths,int considerMonth){
        return monthlyPayment*(Math.pow((1+(interest/1200)),-(1+totalMonths-considerMonth)));
    }
    //return monthlyPayment * (Math.pow((1 + (interest / 1200)), -(totalMonths - dueMonth)));

    public static double interestDue(double monthlyPayment,double duePrincipal){
        return monthlyPayment-duePrincipal;
    }
    public static double remainingPrincipal(double dueInterest,double interest,double duePrincipal){
        return dueInterest/(interest/1200)-duePrincipal;
    }

}
