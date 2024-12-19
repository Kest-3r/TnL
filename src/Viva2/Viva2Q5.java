package Viva2;

public class Viva2Q5 {
    public static void main(String[] args) {
        String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
        String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
        int[] mark = {59, 62, 21, 36, 85, 74};
        //2nd array index 0=ID,1=Name,2=mark
        //student info[] = row for student
        String[][] studentInfo = getStudentInfo(studentID, studentName, mark);
        System.out.println("List of Students and their Marks: ");
        printStudentInfo(studentInfo);
        System.out.println("Student with highest marks: ");
        findStudentWithHighestMarks(studentInfo);
        double average = findAverage(mark);
        System.out.println("Average mark: " + average);
        System.out.println("Students scoring below the average:");
        listStudentsBelowAverage(studentInfo, average);
    }

    public static String[][] getStudentInfo(String[] studentID, String[] studentName, int[] mark) {
        String[][] studentInfo = new String[studentID.length][studentID.length];
        for (int i = 0; i < studentID.length; i++) {
            //2nd array index 0=ID,1=Name,2=mark
            studentInfo[i][0] = studentID[i];
            studentInfo[i][1] = studentName[i];
            studentInfo[i][2] = String.valueOf(mark[i]);
        }
        return studentInfo;
    }

    public static void printStudentInfo(String[][] studentInfo) {
        for (int i = 0; i < studentInfo.length; i++) {
            System.out.printf("%s - %6s : %s\n",studentInfo[i][0],studentInfo[i][1],studentInfo[i][2]);
        }
    }

    public static void findStudentWithHighestMarks(String[][] studentInfo) {
        int highestMark = 0;
        String highestMarkName = "";
        for (int i = 0; i < studentInfo.length; i++) {
                if(Integer.parseInt(studentInfo[i][2])>highestMark){
                highestMark = Integer.parseInt(studentInfo[i][2]);
                highestMarkName = studentInfo[i][1];
            }
        }
        System.out.printf("%s: %d\n",highestMarkName,highestMark);
    }

    public static double findAverage(int[] mark) {
        int sum=0;
        for (int i = 0; i < mark.length; i++) {
            sum+=mark[i];
        }
        double average = sum/(double)mark.length;
        return average;
    }

    public static void listStudentsBelowAverage(String[][] studentInfo, double average) {
        for (int i = 0; i < studentInfo.length; i++) {
            if(Integer.parseInt(studentInfo[i][2])<average){
                System.out.printf("%s : %s\n",studentInfo[i][1],studentInfo[i][2]);
            }
        }
    }
}
