package t8;

public class t8q1 {
//    a.Define a class Student.
//    b. Declare the instance variable that used to store contact number.
//    c. Create the constructor that initializes the contact number to null.

//    d. Create another constructor that assign the parameter value to the contact
//    number.
//    e. Create an accessor and mutator method for the contact number.
//    f. Create a method that used to display the contact number.
        public static class Student{
            private String contact_number;
            public Student(){
                this.contact_number=null;
            }
            public Student(String contact_number){
                this.contact_number=contact_number;
            }
            public void setContact_number(String contact_number){
                this.contact_number=contact_number;
            }
            public String getContact_number(){
                return contact_number;
            }
            public void display_contact_number(){
                System.out.println(getContact_number());
            }
        }
//    g. Create an object of the class Student.
//    h. Change the contact number using the mutator method.
//    public static void main(String[] args) {
//            Student student = new Student("1027913214");
//    }
//    i. Create an object of the class Animal.
        public static class Animal{

}
//    j. Create an object of the class Animal that used to represent a cat.
//        public static void main(String[] args) {
//            Animal cat = new Animal();
//        }
//    k. Create an object of the class Number with the value 20 and 40.
        public static class Number {
            private int value;

            // Constructor
            public Number(int value) {
                this.value = value;
            }
        }

    public static void main(String[] args) {
            Number num1 = new Number(20);
            Number num2 = new Number(40);
        }
}
