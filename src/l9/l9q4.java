package l9;

//Create a Dice game. The first dice game allows the player to roll two dices each time.
//If both dice is equal, the player can roll again. The player score each time they roll the
//dices. Player that reaches 100 points or more wins the game. The second dice game
//allows the player to roll one dice each time. When the dice is 6, the player can roll
//one more time. However, if the player rolls 6 again in second attempt, the player
//won’t have any score. Player that reaches 100 point wins the game. If the player
//scores more than 100, the last score is not counted and the player needs to roll again
//in next turn. Create a Tester class to test the program.

import java.util.ArrayList;
import java.util.Random;

class DiceGame{
    ArrayList<Integer> score= new ArrayList<>();
    Random random;
    public void addPlayer(){
        this.score.add(0);
    }
    public int roll(){
        random = new Random();
        return random.nextInt(0,7);
    }

}
class FirstDiceGame extends DiceGame{
    public boolean winCheck(){
        for(int i:this.score) {
            if (i >= 100) {
                return true;
            }
        }return false;
    }
    public void startGame(){
        System.out.print("Welcome to the First Dice Game\n\n");
        gameLoop:while(!winCheck()) {

            for(int i=0,playerCount=1;i<this.score.size();i++,playerCount++) {
                int tempRoll=roll();
                System.out.printf("Player %d roll: %d\n",playerCount,tempRoll);
                this.score.set(i, this.score.get(i)+tempRoll);
                System.out.printf("Player %d score: %d\n",playerCount,this.score.get(i));
                if(winCheck()) break gameLoop;
            }
            System.out.println("--------------------");
        }
    }
}
class SecondDiceGame extends DiceGame{
    public boolean winCheck(){
        for(int i:this.score) {
            if (i == 100) {
                return true;
            }
        }return false;
    }
    public void startGame(){
        System.out.print("Welcome to the Second Dice Game\n\n");
        gameLoop:while(!winCheck()) {

            for(int i=0,playerCount=1;i<this.score.size();i++,playerCount++) {
                int tempRoll=0;
                int temp1stRoll=roll();
                System.out.printf("Player %d roll: %d\n",playerCount,temp1stRoll);
                if(temp1stRoll == 6) {
                    tempRoll+=temp1stRoll;
                    int temp2ndRoll=roll();
                    if(temp2ndRoll==6){
                        tempRoll=0;
                    }else{
                        tempRoll+=temp2ndRoll;
                        System.out.printf("Player %d roll: %d\n",playerCount,temp2ndRoll);
                    }
                }else{
                    tempRoll=temp1stRoll;
                }

                if(this.score.get(i)+tempRoll>100) {
                    System.out.println("Stuck");
                    System.out.printf("Player %d score: %d\n",playerCount,this.score.get(i));
                }else{
                    this.score.set(i, this.score.get(i)+tempRoll);
                    System.out.printf("Player %d score: %d\n",playerCount,this.score.get(i));
                }
                if(winCheck()) break gameLoop;
            }
            System.out.println("--------------------");
        }
    }
}

public class l9q4 {
    public static void main(String[] args) {
        FirstDiceGame firstDiceGame = new FirstDiceGame();
        firstDiceGame.addPlayer();
        firstDiceGame.addPlayer();
        firstDiceGame.startGame();

        SecondDiceGame secondDiceGame = new SecondDiceGame();
        secondDiceGame.addPlayer();
        secondDiceGame.addPlayer();
        secondDiceGame.startGame();
    }
}
