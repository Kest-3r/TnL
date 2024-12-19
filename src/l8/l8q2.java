package l8;

public class l8q2 {
    //Define a class name BankAccount. The class allows the customer to open the saving
    //account with their name, IC or passport number and the deposit amount. The class
    //consists of deposit method and withdraws method. Besides, the class can display the
    //current balance. Create a Tester class to test the program.
    public static class BankAccount{
        private String name;
        private String IC;
        private String passport_number;
        private double balance;
        public BankAccount(String name,String IC,String passport_number,double deposit_amount){
            this.name=name;
            this.IC=IC;
            this.passport_number=passport_number;
            this.balance+=deposit_amount;
        }
        public void deposit(double amount){
            this.balance+=amount;
        }
        public void withdraw(double amount){
            this.balance-=amount;
        }
        public void Display(){
            System.out.println("Balance"+this.balance);
        }
    }

    public class tester{
        public static void main(String[] args){
            BankAccount bankAccount =new BankAccount("Kester","0282324","12312413",3000.5);
        }
    }
}
