package l8;

public class l8q3 {
    //Define a class name WeightCalculator. The class has an input method that accepts the
    //user’s age and height. Besides, the class consists a method that calculating the
    //recommend weight with this formula
    //recommend weight = (height – 100 + age / 10) * 0.9
    //The class will display the user’s age, height and the recommend weight. Create a
    //Tester class to test the program.
    public static class WeightCalculator{
        private int age;
        private double height;
        private double weight;
        public void calculateRecommendedWeight(int age,double height){
            this.age=age;
            this.height=height;
            this.weight=(height-100+age/10.0)*0.9;
        }

        public void displayRecommendedWeight(){
            System.out.printf("Recommended Weight: %-5.2f",this.weight);
        }
    }
    public class tester{
        public static void main(String[] args) {
        WeightCalculator weightCalculator=new WeightCalculator();
        weightCalculator.calculateRecommendedWeight(23,178);
        weightCalculator.displayRecommendedWeight();
        }
    }
}
