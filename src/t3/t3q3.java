package t3;

public class t3q3 {
    public static void main(String[] args) {
        int x=9,y=10;
        //a
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        /*
        #####
        $$$$$
         */
        //b.
        if (x < 10) {
            if (y < 10)
                System.out.println("*****");
            else{
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
        /*
        ######
        $$$$$$
         */
        //c.
        if (x < 10) {
            if (y < 10)
                System.out.println("*****");
            System.out.println("#####");
        }
        else {
            System.out.println("$$$$$");
        }
        /*
        #####
         */
        //d.
        if (x > 10) {
            if (y > 10) {
                System.out.println("*****");
                System.out.println("#####"); }
            else
                System.out.println("$$$$$");
        }
        /*
        none
         */


    }
}
