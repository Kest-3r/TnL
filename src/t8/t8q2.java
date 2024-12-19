package t8;

public class t8q2 {
//    a. Define a class Digit.
//    b. Declare the instance variable that used to store a number.
//    c. Create a constructor that assign the parameter value to the number.
//    d. Create a digitMultiplication method that returns the multiplication of the
//    number. If the number is 1345, the method will return 60.
//    e. Create a method that used to display the digit multiplication of the number.
    public static class Digit{
            private int digit;
            public Digit(int digit) {
                this.digit = digit;
            }
            public int digitMultiplication(){
                int num=this.digit;
                int sum=1;
                while(num%10>0){
                    sum=num%10*sum;
                    num=num/10;
                }
                return sum;
            }
            public void displayMultiplication(){
                System.out.println(digitMultiplication());
            }

    }


//    f. Create a tester class that displays the digit multiplication of 4567.
        public static class tester {
        public static void main(String[] args) {
            Digit digit = new Digit(1345);
            digit.displayMultiplication();

        }
        }
}
