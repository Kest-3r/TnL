package l3;

import java.util.Random;
import java.lang.Integer;

public class l3q4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int score1,score2,roll1,roll2;
        String winner;
        //player 1
        roll1 = rd.nextInt(0,7);
        roll2 = rd.nextInt(0,7);
        score1 = Integer.compare(roll1,roll2)>0 ? roll1 : roll2 ;
        //player 2
        roll1 = rd.nextInt(0,7);
        roll2 = rd.nextInt(0,7);
        score2 = Integer.compare(roll1,roll2)>0 ? roll1 : roll2 ;

        //compare score
        winner = Integer.compare(score1,score2)>0? "player 1":"player 2";
        System.out.println("The winner is "+winner);
    }
}
