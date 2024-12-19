package t8;

public class t8q4 {
    //Create a class Payment that accept different type of payment methods such as cash
    //payment, cheque payment and credit card payment. For cash payment, the class
    //accepts the amount in cash; for cheque payment, the class accepts the amount and the
    //cheque number; for credit card payment, the class accepts the amount, card holder
    //name, cardType, expiration date and validation code. Use the same method name for
    //the payment.
    public static class Payment{
        private String payment_method;
        private Double amount;
        private String cheque_number;
        private String card_holder_name;
        private String card_type;
        private String expiration_date;
        private String validation_code;
        //cash
        public Payment(String payment_method,Double amount){
            this.payment_method=payment_method;
            this.amount =amount;
        }

        //cheque
        public Payment(String payment_method,Double amount,String cheque_number){
            this.payment_method=payment_method;
            this.amount =amount;
            this.cheque_number=cheque_number;
        }
        //credit card
        public Payment(String payment_method,Double amount,String card_holder_name,String card_type,String expiration_date,String validation_code){
            this.payment_method=payment_method;
            this.amount =amount;
            this.card_holder_name=card_holder_name;
            this.card_type=card_type;
            this.expiration_date=expiration_date;
            this.validation_code=validation_code;
        }
    }
}
