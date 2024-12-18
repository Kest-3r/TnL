package l7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class l7q2 {
    public static void main(String [] args){
        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            StringBuilder SB = new StringBuilder();
            while(in.hasNextLine()) {
                SB.append(in.nextLine());
            }

            in.close();

            PrintWriter outputStream = new PrintWriter(new FileWriter("test.html"));
            outputStream.write(SB.toString());
            outputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }


}