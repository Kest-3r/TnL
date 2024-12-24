package t9;

public class t9q4 {

}

//Define a class PurchaseSystem. The class consists of product code, unit price,
//quantity and total price. Besides the class consists of a method to compute the total
//price and a display method. Derived a class SugarPurchase from PurchaseSystem.
//This new class add a sugar weight attributed and override the method to compute the
//total price as unit price*quantity*sugar weight.

class PurchaseSystem{
    String product_code;
    double unit_price;
    int quantity;
    double total_price;

    PurchaseSystem(String product_code, double unit_price, int quantity, double total_price) {
        this.product_code = product_code;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.total_price = total_price;
    }

    public void compute_total(){
        this.total_price = this.unit_price * this.quantity;
    }
    public void display(){
        System.out.printf("Product Code: %s\nUnit price: %f\nQuantity: %d\nTotal price: %f",this.product_code,this.unit_price,this.quantity,this.total_price);
    }
}
class SugarPurchase extends PurchaseSystem{
    double sugar_weight;
    SugarPurchase(String product_code, double unit_price, int quantity, double total_price) {
        super(product_code, unit_price, quantity, total_price);
        this.sugar_weight = quantity;
    }
    @Override
    public void compute_total(){
        this.total_price = this.unit_price * this.quantity*this.sugar_weight;
    }
}
