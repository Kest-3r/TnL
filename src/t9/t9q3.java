package t9;

public class t9q3 {
    public static void main(String[] args) {
        RegularPay pay1 = new RegularPay(2,5.6);
        SpecialPay pay2 = new SpecialPay(2,5.6);
    }
}
//Define a class PaySystem. The class consists of the payrate per hour and the number
//of hours. The class also contains a method to return the total pay for a given amount
//of hours and a method to display the total payment. Derive a class RegularPay from
//PaySystem that has a constructor and did not override any base methods. Derived a
//class SpecialPay from PaySystem that override the base method and return the total
//pay plus 30% commission.
class PaySystem{
    double payrate_per_hour;
    double number_of_hour;
    public double total_payment(){
        return this.payrate_per_hour*this.number_of_hour;
    }
    public void display(){
        System.out.printf("Total Payment:%f\n",total_payment());
    }
}
class RegularPay extends PaySystem{
    public RegularPay(double payrate_per_hour, double number_of_hour){
        this.payrate_per_hour = payrate_per_hour;
        this.number_of_hour = number_of_hour;
        display();
    }
}
class SpecialPay extends PaySystem{
    public SpecialPay(double payrate_per_hour, double number_of_hour){
        this.payrate_per_hour = payrate_per_hour;
        this.number_of_hour = number_of_hour;
        display();
    }
    @Override
    public double total_payment(){
        return this.payrate_per_hour*this.number_of_hour*1.3;
    }

}
