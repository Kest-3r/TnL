package t8;

public class t8q3 {
//    Create a class that used to represent the 2 dimension coordinate system. The class
//    consists of constructors, instance variables, accessor and mutator method and an
//    output method that display the x-coordinate and y-coordinate.
    public class coordinate{
        private double x,y;
        public coordinate(){}
        public void setCoordinate(double x,double y){
            this.x=x;
            this.y=y;
        }
        public double getCoordinateX(){
            return this.x;
        }
        public double getCoordinateY(){
            return this.y;
        }
        public void displayCoordinate(){
            System.out.printf("X;%f\nY:%f",getCoordinateX(),getCoordinateY());
        }
    }
}
