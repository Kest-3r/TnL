package l8;

public class l8q4 {
    //Define a class Fraction. The class has an input method that accepts the numerator and
    //the denominator from the user. Use the mutator method to set the numerator and
    //denominator and the accessor method to get the value of numerator and denominator.
    //This class also has a method to display the fraction reduced to lowest terms. (find the
    //greatest common divisor for the numerator and denominator. Create a Tester class to
    //test the program

    public static class Fraction{
        private int numerator;
        private int denominator;
        public void setNumeratorDenominator(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }
        public int getNumerator(){
            return this.numerator;
        }
        public int getDenominator(){
            return this.denominator;
        }
        public void displayFraction(){
            int gcd=GCD(this.numerator,this.denominator);
            System.out.printf("Fraction: %d/%d",this.numerator/gcd,this.denominator/gcd);

        }
        public int GCD(int a, int b){
            int largest_num=0;

            if(a>b) largest_num=a;
            else if(a<b) largest_num=b;
            else return 1;

            int GCD=1;
            for(int i =2;i<largest_num;i++){
                if(a%i==0 && b%i==0) GCD=i;
            }
            return GCD;
        }
    }

    public class tester{
        public static void main(String[] args){
        Fraction fraction = new Fraction();
        fraction.setNumeratorDenominator(2,4);
        fraction.displayFraction();
        }
    }
}
