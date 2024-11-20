package l5;

import java.util.Random;

public class l5q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] num = new int [10];
        boolean[] repeat = new boolean[21];

        for(int i = 0 ; i<=9;i++) {
            int rand = rd.nextInt(0,21);

            if(!repeat[rand]) repeat[rand]=true;
            else {
                do{
                    rand = rd.nextInt(0,21);
                }while(repeat[rand]);
                repeat[rand] = true;
            }
            num[i] = rand;
        }

    }
}
