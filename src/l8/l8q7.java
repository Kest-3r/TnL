package l8;

public class l8q7 {
    //Define class money. The class is used to calculate the number of note and coins for a
    //given amount of money. The available notes are RM100, RM50, RM10, RM5 and
    //RM1. The available coins are 50cent, 20cent, 10cent and 5 cent. The class needs to
    //round up the amount according to the table below. The class also contains addition
    //and subtraction method to add or subtract two objects
    public class Money{
        private double sum;
        private int numRM100;
        private int numRM50;
        private int numRM10;
        private int numRM5;
        private int numRM1;
        private int num50cent;
        private int num20cent;
        private int num10cent;
        private int num5cent;
        public Money(double sum){
            setMoney(sum);
        }
        public double getSum(){
            return this.sum;
        }
        public void addition(Money add){
            this.sum+=add.getSum();
            setMoney(this.sum);
        }
        public void subtraction(Money sub){
            this.sum-=sub.getSum();
            setMoney(this.sum);
        }
        public void setMoney(double sum){
            this.sum = sum;
            // Reset all denominations to zero before recalculating
            this.numRM100 = 0;
            this.numRM50 = 0;
            this.numRM10 = 0;
            this.numRM5 = 0;
            this.numRM1 = 0;
            this.num50cent = 0;
            this.num20cent = 0;
            this.num10cent = 0;
            this.num5cent = 0;
            if (sum >= 100) {
                this.numRM100 = (int) sum / 100;
                sum -= (this.numRM100 * 100);
            }
            if (sum >= 50) {
                numRM50 = (int) sum / 50;
                sum -= (numRM50 * 50);
            }
            if (sum >= 10) {
                numRM10 = (int) sum / 10;
                sum -= (numRM10 * 10);
            }
            if (sum >= 5) {
                numRM5 = (int) sum / 5;
                sum -= (numRM5 * 5);
            }
            if (sum >= 1) {
                numRM1 = (int) sum / 1;
                sum -= (numRM1 * 1);
            }
            if (sum >= 0.5) {
                num50cent = (int) (sum / 0.5);
                sum -= (num50cent * 0.5);
            }
            if (sum >= 0.2) {
                num20cent = (int) (sum / 0.2);
                sum -= (num20cent * 0.2);
            }
            if (sum >= 0.1) {
                num10cent = (int) (sum / 0.1);
                sum -= (num10cent * 0.1);
            }
            if (sum >= 0.05) {
                num5cent = (int) (sum / 0.05);
                sum -= (num5cent * 0.05);
            }
            int decimal_num =(int)((this.sum*100)%100);
            if(decimal_num%10==1||decimal_num%10==2){
                decimal_num = decimal_num-(decimal_num%10);
                this.sum=(int)this.sum+(double)decimal_num/100;
            } else if(decimal_num%10==3||decimal_num%10==4||decimal_num%10==6||decimal_num%10==7){
                decimal_num = decimal_num-(decimal_num%10)+5;
                this.sum=(int)this.sum+(double)decimal_num/100;
            } else if (decimal_num%10==8||decimal_num%10==9){
                decimal_num = decimal_num-(decimal_num%10)+10;
                this.sum=(int)this.sum+(double)decimal_num/100;
            }
        }
    }
}
