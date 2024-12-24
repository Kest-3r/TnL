package l9;
    //Define a class Shape. The class has a name, perimeter and area. The class has the
    //accessor method and mutator for perimeter and area. Besides, the class also has a
    //display method to display the name of the shape, perimeter and area in two decimal
    //points. Derived a class name Rectangle from Shape. The class has the extra side
    //length variables. The class has a method to accept input for both side length and a
    //method to compute the perimeter and area. Derived another class name Square from
    //Shape. The class has the extra side length variable. The class has a method to accept
    //input for side length and a method to compute the perimeter and area. Derived
    //another class name Circle from Shape. The class has the extra diameter variable.
    //The class has a method to accept input for diameter and a method to compute the
    //perimeter and area. Create a Tester class to test the program.

class Shape{
    String name;
    double perimeter;
    double area;
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double getArea(){
        return this.area;
    }
    public double getPerimeter(){
        return this.perimeter;
    }
    public void display(){
        System.out.printf("Name: %s\nPerimeter: %.2f\nArea: %.2f\n\n",this.name,getPerimeter(),getArea());
    }
}

class Rectangle extends Shape{
    double side_length1,side_length2;
    public Rectangle(String name){
        this.name=name;
    }
    public void setSideLength(double side_length1,double side_length2) {
        this.side_length1 = side_length1;
        this.side_length2 = side_length2;
    }
    public void compute(){
        setArea(this.side_length1*this.side_length2);
        setPerimeter(this.side_length1*2+this.side_length2*2);
    }
}
class Square extends Shape{
    double side_length;
    public Square(String name){
        this.name=name;
    }
    public void setSideLength(double side_length) {
        this.side_length = side_length;
    }
    public void compute(){
        setArea(this.side_length*this.side_length);
        setPerimeter(this.side_length*4);
    }
}
class Circle extends Shape{
    double diameter;
    public Circle(String name){
        this.name=name;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public void compute(){
        setArea(3.142*Math.pow((this.diameter/2),2));
        setPerimeter(3.142*this.diameter);
    }
}
public class l9q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle");
        Square square = new Square("Square");
        Circle circle = new Circle("Circle");

        rectangle.setSideLength(2.4,4.5);
        rectangle.compute();
        rectangle.display();

        circle.setDiameter(4.6);
        circle.compute();
        circle.display();

    }
}