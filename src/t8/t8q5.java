package t8;

public class t8q5 {
    //Create a class Connection. The Connection class keeps track of the number of
    //connections to the server. Whenever an object is created, a connection is established.
    //The class has a disconnect method and a display method that display the number of
    //connections to the server
    public class Connection{
        private int numConnection=0;
        public Connection(){
            numConnection++;
        }
        public void disconnect(){
            numConnection--;
        }
        public void display(){
            System.out.printf("Number of connection: %d\n",numConnection);
        }
    }
}
