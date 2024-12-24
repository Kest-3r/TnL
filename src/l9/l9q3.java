package l9;

//Derived a class Lecturer from class PersonProfile. The class has a list of course name,
//course code, semester, session, credit hour and the number of students registered. All
//the information is retrieved from a text file named lecturer.txt. (Please download the
//file from the Web site.). Write a method to compute the credit hour. If the number of
//students is more than or equal to 150, multiply the credit hour by 3, if less than 150
//and more than or equal to 100, multiply the credit hour by 2. If less than 100 and
//more than or equal to 50, multiply the credit hour by 1.5. Otherwise multiply the 2
//credit hour by 1. The lecture object can display the lecturer profile as well as the
//course profile with the updated credit hour. Create a Tester class to test the program

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Lecturer extends PersonProfile{
    String[] courseName=new String[4];
    String[] courseCode=new String[4];
    int[] semester=new int[4];
    int[] session=new int[4];
    double[] creditHour=new double[4];
    int[] numStudent=new int[4];

    Lecturer(String name,char gender,String dateOfBirth){
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        readFile();
        computeCreditHour();
    }

    public void readFile(){
        try{
            Scanner inputStream = new Scanner(new FileInputStream("C:/Users/keste/IdeaProjects/TnL/l9datas/"+"lecturer.txt"));
            int i=0;
            while(inputStream.hasNext()){
                this.courseCode[i]=inputStream.nextLine();
                this.courseName[i]=inputStream.nextLine();
                this.session[i]=Integer.parseInt(inputStream.nextLine());
                this.semester[i]=Integer.parseInt(inputStream.nextLine());
                this.creditHour[i]=Integer.parseInt(inputStream.nextLine());
                this.numStudent[i]=Integer.parseInt(inputStream.nextLine());
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    public void computeCreditHour(){
        for(int i=0;i< courseName.length;i++){
            if(this.numStudent[i]>=150)this.creditHour[i]=this.creditHour[i]*3;
            else if(this.numStudent[i]>=100)this.creditHour[i]=this.creditHour[i]*2;
            else if(this.numStudent[i]>=50)this.creditHour[i]=this.creditHour[i]*1.5;
            else if(this.numStudent[i]>=10)this.creditHour[i]=this.creditHour[i]*1;
        }
    }
    public void displayCourseProfile(){
        for(int i=0;i<this.courseName.length;i++){
            System.out.println();
            System.out.printf("Course name:%s\nCourse code: %s\nSemester: %d\nSession: %d\nCredit Hour: %.2f\nNumber of Student: %s\n",this.courseName[i],this.courseCode[i],this.semester[i],this.session[i],this.creditHour[i],this.numStudent[i]);
        }
    }
}

public class l9q3 {
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer("Kester",'M',"22/4/2005");
        lecturer.display();
        lecturer.displayCourseProfile();
    }
}
