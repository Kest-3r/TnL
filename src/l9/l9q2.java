package l9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Define a class PersonProfile. The class has a name, gender and date of birth. The
//class consists of a constructor and a display method. Derived a Student class from
//PersonProfile. The Student class has a list of course name and course code, semester,
//session, mark and a file name. The class consists of a constructor with student profile
//and file input name. All the information is retrieved from a text file named
//course.txt. (Please download the file from the Web site.). Create a getGrade method
//for the mark base on the table below:
class PersonProfile{
    String name;
    char gender;
    String dateOfBirth;
    PersonProfile(){

    }
    public void display(){
        System.out.printf("Name: %s\nGender: %c\nDate of Birth: %s\n",this.name,this.gender,this.dateOfBirth);
    }
}
class Student extends PersonProfile{
    String[] courseName=new String[5];
    String[] courseCode=new String[5];
    int[] semester=new int[5];
    int[] session=new int[5];
    int[] mark=new int[5];
    String[] grade=new String[5];
    String fileName;

    Student(String name,char gender,String dateOfBirth,String fileName){
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.fileName=fileName;
        readFile();

    }
    public String[] getCourseName(){
        return this.courseName;
    }
    public void readFile(){
        try{
            Scanner inputStream = new Scanner(new FileInputStream("C:/Users/keste/IdeaProjects/TnL/l9datas/"+this.fileName));
            int i=0;
            while(inputStream.hasNext()){
                this.courseCode[i]=inputStream.nextLine();
                this.courseName[i]=inputStream.nextLine();
                this.session[i]=Integer.parseInt(inputStream.nextLine());
                this.semester[i]=Integer.parseInt(inputStream.nextLine());
                this.mark[i]=Integer.parseInt(inputStream.nextLine());
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    public void computeGrade(){
        for(int i=0;i<5;i++){
            int temp_mark=this.mark[i];
            if(temp_mark>=85) grade[i]="A";
            else if(temp_mark>=75) grade[i]="A-";
            else if(temp_mark>=70) grade[i]="B+";
            else if(temp_mark>=65) grade[i]="B";
            else if(temp_mark>=60) grade[i]="B-";
            else if(temp_mark>=55) grade[i]="C+";
            else if(temp_mark>=50) grade[i]="C";
            else if(temp_mark>=45) grade[i]="D";
            else if(temp_mark>=35) grade[i]="E";
            else if(temp_mark<35) grade[i]="F";

        }
    }
    public void displayCourseGrade(){
        computeGrade();
        for(int i=0;i<this.courseName.length;i++){
            System.out.println();
            System.out.printf("Course name:%s\nCourse code: %s\nSemester: %d\nSession: %d\nMark: %d\nGrade: %s\n",this.courseName[i],this.courseCode[i],this.semester[i],this.session[i],this.mark[i],this.grade[i]);
        }
    }
}
public class l9q2 {
    public static void main(String[] args) {
        Student student  =new Student("Kester",'m',"21/9/2005","course.txt");
        student.display();
        student.displayCourseGrade();
    }
}
