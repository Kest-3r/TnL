package l7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class l7q2 {
    public static void main(String [] args){
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            StringBuilder result = new StringBuilder();
            while(in.hasNextLine()) {
                result.append(in.nextLine());
            }

            BufferedWriter w = new BufferedWriter(new FileWriter("index.htm"));
            w.write(result.toString());
            w.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }


}