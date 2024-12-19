package l8;

public class l8q6 {
    //You operate several burger stalls distributed throughout town. Each burger stall has
    //an ID and the number of burger sold for the day. The class consists of a constructor to
    //initialize the instance variables and a sold method that increment the number of
    //burger sold by parameter value. The class also contains a variable and method that
    //tracks the total number of burgers sold in all stalls. Display the total burger sold by
    //each stall and the total number of burgers sold in all stalls.
    public static class Burger_Stall{
        //local
        private String ID;
        private int num_sold;
        //global
        private Burger_Stall[] Stalls;
        private int total_num_sold;
        public Burger_Stall(String ID, int num_sold) {
            this.ID = ID;
            this.num_sold = num_sold;
        }
        public void incrSales(int num_sold){
            this.num_sold += num_sold;
        }
        public int getNum_sold(){
            return this.num_sold;
        }
        public String getID(){
            return this.ID;
        }
        public void computeTotalSales(){
            total_num_sold =0;
            for(Burger_Stall stalls:Stalls){
                total_num_sold+=stalls.getNum_sold();
            }
        }
        public void displaySales(){
            System.out.printf("Total burger sold: %d\n",total_num_sold);
            for(Burger_Stall stalls:Stalls){
                System.out.printf("Stall: %s\n",stalls.getID());
                System.out.printf("Burger sold: %d\n\n",stalls.getNum_sold());
            }
        }
    }
}
