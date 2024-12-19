package l8;

import java.util.Random;

public class l8q5 {
    //Define a class Game. The class has a constructor that accept player name. Besides,
    //the class contains a method move that roll the dice. Create a Tester class to test the
    //program with two players and the player that reach 100 or more win the game.
    public static class Game{
        private String name;
        private int score;
        Random random = new Random();
        public Game(String name){
            this.name = name;
        }
        public int getScore(){
            return this.score;
        }
        public void move(){
            this.score+= random.nextInt(0,13);
        }
    }
    public class tester{
        public static void main(String[] args){
            Game player1 = new Game("player1");
            Game player2 = new Game("player2");
            while(player1.getScore()<100||player2.getScore()<100){
                player1.move();
                player2.move();
            }
            if(player1.getScore()>player2.getScore())
                System.out.printf("player 1 won: %d",player1.getScore());
            else if(player2.getScore()>player1.getScore())
                System.out.printf("player 2 won: %d",player2.getScore());
        }
    }
}
