package l3;
import java.util.Random;

public class l3q2 {
    public static void main(String[] args) {
        int rd_num;
        Random rd = new Random();

        rd_num = rd.nextInt(0,6);

        if(rd_num==0){
            System.out.println(rd_num +" is zero");
        }
        else if(rd_num==1){
            System.out.println(rd_num +" is one");
        }
        else if(rd_num==2){
            System.out.println(rd_num +" is two");
        }
        else if(rd_num==3){
            System.out.println(rd_num +" is three");
        }
        else if(rd_num==4){
            System.out.println(rd_num +" is four");
        }
        else if(rd_num==5){
            System.out.println(rd_num +" is five");
        }
    }
}
