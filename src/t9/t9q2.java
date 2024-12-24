package t9;

public class t9q2 {
}
//Define a class Organism. The class contains the initial size of the organism and the
//growth rate. Create a constructor to initialize the instance variables. Then, define a
//class Animal. Animal is an organism that has extra instance variable which is the
//amount of eating need. Create a constructor to initialize the instance variable and a
//method to display the Animal instance variables.

class Organism{
    double size;
    double growth_rate;

    public Organism(double size, double growth_rate){
        this.size=size;
        this.growth_rate=growth_rate;
    }
}

class Animal extends Organism{
    double amount_of_eat;
    public Animal(double size, double growth_rate,double amount_of_eat){
        super(size,growth_rate);
        this.amount_of_eat=amount_of_eat;
    }
    public void display(){
        System.out.printf("This animal needs %f of food, size%f, growth rate%f",this.amount_of_eat,this.size,this.growth_rate);
        super.size=2;
    }

}