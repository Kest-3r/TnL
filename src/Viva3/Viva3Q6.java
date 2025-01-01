package Viva3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

class Hero{
    String name;
    String element;
    double HP;
    double attack;

    public Hero(String name,String element,double HP,double attack){
        this.name=name;
        this.element=element;
        this.HP=HP;
        this.attack=attack;
    }
    public int calculateDamage(Villain enemy,int rsMultipler){
        double damage=this.attack*enemy.getDefense();
        return 0;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\nElement: %s\nHP: %.1f\nAttack: %.1f\n", this.name,this.element,this.HP,this.attack);
    }
    //Getters
    public String getName() {return this.name;}
    public String getElement() {return this.element;}
    public double getHP() {return this.HP;}
    public double getAttack() {return this.attack;}
}
class Villain{
    String name;
    String element;
    double maxHP;
    double HP;
    double attack;
    double defense;
    int initialCD;
    int CD;

    public Villain(String name,String element,double maxHP,int defense,int attack,int initialCD){
        this.name=name;
        this.element=element;
        this.maxHP=maxHP;
        this.defense=defense;
        this.attack=attack;
        this.initialCD=initialCD;

    }
    public int getDamaged(double damage){
        return 0;
    }
    public int resetHP(){
        this.HP = this.maxHP;
        return 0;
    }
    public void decreaseCD(){
        this.CD--;
    }
    public void resetCD(){
        this.CD=this.initialCD;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\nElement: %s\nHP: %.1f\nDefense: %.1f\nAttack: %.1f\nCD:%d\n",this.name,this.element,this.maxHP,this.defense,this.attack,this.initialCD);
    }
    //Getters
    public String getName() {return this.name;}
    public String getElement() {return this.element;}
    public double getHP() {return this.HP;}
    public double getAttack() {return this.attack;}
    public double getDefense() {return this.defense;}
    public int getCD() {return this.CD;}
}

class Team{
    String deck;
    Hero[] heroList;
    int hp;
    public Team(Hero[] newHeroList){
        heroList=newHeroList;
        System.out.println(heroList[0].toString());
        formTeam();
        toString();
    }
    public void formTeam(){
        HashSet<Integer> visit=new HashSet<>();
        Random random = new Random();
        this.heroList=new Hero[4];
        boolean fullTeam=false;
        // j=current row i=row

        int j=0;
        while (!fullTeam) {

            int i = random.nextInt(0,heroList.length);
            if(!visit.contains(i)){
                System.out.println("working");
                this.heroList[j]=heroList[i];
                System.out.println(this.heroList[j].toString());
                visit.add(i);
                j++;
            }
            if(j==4) fullTeam=true;
        }

    }
    public int getDamaged(Double damage){
        return 0;
    }
    public void resetHP(){

    }
    @Override
    public String toString() {
        StringBuilder strHeroList= new StringBuilder();
        for(int i=0;i<this.heroList.length;i++){
            strHeroList.append(String.format("Hero %d\n%s\n", i+1, this.heroList[i].toString()));
        }
        return strHeroList.toString();
    }
}

class Game{
    public void battle(Team team,Villain enemy){

    }
}
public class Viva3Q6 {
    public static void main(String[] args) {
        Hero molly = new Hero("Molly", "Water", 45, 20);
        Hero sean = new Hero("Sean", "Fire", 36, 24);
        Hero duncan = new Hero("Duncan", "Earth", 53, 16);
        Hero nathaniel = new Hero("Nathaniel", "Light", 37, 24);
        Hero endor = new Hero("Endor", "Dark", 43, 21);
        Hero urd = new Hero("Urd", "Water", 65, 17);
        Hero skuld = new Hero("Skuld", "Fire", 66, 16);
        Hero verthandi = new Hero("Verthandi", "Earth", 74, 13);
        Hero idun = new Hero("Idun", "Light", 59, 19);
        Hero valkyrie = new Hero("Valkyrie", "Dark", 61, 18);
        Hero poseidon = new Hero("Poseidon", "Water", 58, 19);
        Hero hephaestus = new Hero("Hephaestus", "Fire", 51, 22);
        Hero athena = new Hero("Athena", "Earth", 61, 18);
        Hero apollo = new Hero("Apollo", "Light", 55, 16);
        Hero artemis = new Hero("Artemis", "Dark", 50, 23);

        Hero[] heroes = {molly, sean, duncan, nathaniel, endor, urd, skuld,
                verthandi, idun, valkyrie, poseidon, hephaestus, athena, apollo, artemis};

        Villain giemsa = new Villain("Giemsa", "Water", 100, 150, 15, 2);
        Villain diablo = new Villain("Diablo", "Fire", 120, 163, 13, 3);
        Villain nidhogg = new Villain("Nidhogg", "Earth", 130, 189, 11, 4);
        Villain lucifer = new Villain("Lucifer", "Light", 110, 207, 17, 3);
        Villain odin = new Villain("Odin", "Dark", 135, 196, 14, 5);

        Team team = new Team(heroes);
        Game game = new Game();

        team.formTeam();
        System.out.println(team);

        game.battle(team, giemsa);
    }
}
