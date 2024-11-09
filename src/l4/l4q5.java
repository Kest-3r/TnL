package l4;

import java.util.Random;

public class l4q5 {
    public static void main(String[] args) {
        Random random = new Random();

        int P1_score=0,P2_score=0;
        int score;
        boolean P1_turn=true,P2_turn=true;
        GameOver:
        {
            while (true) {
                while (true) {
                    score = random.nextInt(0, 7);
                    System.out.printf("Player one rolled: %d\n", score);
                    P1_score += score;
                    if(gameOverCheck(P1_score,P2_score)) break GameOver;
                    if (score != 6) break;
                }
                while (P2_turn) {
                    score = random.nextInt(0, 7);
                    System.out.printf("Player two rolled: %d\n", score);
                    P2_score += score;
                    if(gameOverCheck(P1_score,P2_score)) break GameOver;
                    if (score != 6) break;
                }
            }
        }
        System.out.println("Game Over");
        System.out.printf("Player one score: %d\n",P1_score);
        System.out.printf("Player two score: %d\n",P2_score);
    }

    public static boolean gameOverCheck(int P1_score, int P2_score){
        return(P1_score>100||P2_score>100);
    }
}
