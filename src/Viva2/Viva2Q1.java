package Viva2;

import java.util.Scanner;



public class Viva2Q1 {

    static double balance= 1000.00;
    static double deposited= 0.00;
    static double withdrew= 0.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean exit=false;
        System.out.println("Welcome to the Bank!");

        while (!exit) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();

            if (opt==1) {
                checkbalance();
            }

            else if (opt==2) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                deposit(depositAmount);
            }

            else if (opt==3) {
                System.out.print("Enter amount to withdraw: RM");
                double withdrawAmount = sc.nextDouble();
                withdraw(withdrawAmount);
            }

            else if (opt==4) {
                printTransactions();
            }

            else if (opt==5) {
                exit=true;
                System.out.println();
                System.out.println("Thank you for using our banking system!");
                System.out.printf("Your final balance is: RM%.2f\n", balance);
                break;

            }

            else {
                System.out.println("invalid option. Please try again.");
            }

            System.out.println();
        }
    }



    public static void checkbalance() {
        System.out.printf("Current balance: %.2f\n", balance);
    }



    public static void deposit(double amount) {
        if (amount>0) {
            balance+=amount;
            deposited+=amount;
            System.out.printf("Your balance is now: %.2f\n", balance);
        }
        else
            System.out.println("Deposit amount must be positive.");
    }



    public static void withdraw(double amount) {
        if (balance>0 && amount<=balance) {
            balance-=amount;
            withdrew+=amount;
            System.out.printf("Your balance is now: RM %.2f\n", balance);
        }
        else
            System.out.println("Insufficient balance. withdrawal failed.");
    }

    public static void printTransactions() {
        System.out.println("Transaction History: ");
        System.out.printf("Deposited: RM%.2f\n", deposited);
        System.out.printf("Withdrew: RM%.2f\n", withdrew);
    }

}