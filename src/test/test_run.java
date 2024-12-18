package test;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

public class test_run {
    public static void main(String[] args) {
        try{
            Scanner productInputStream = new Scanner(new FileInputStream("C:/Users/keste/IdeaProjects/TnL/Lab07/product.txt"));
            Scanner orderInputStream = new Scanner(new FileInputStream("C:/Users/keste/IdeaProjects/TnL/Lab07/order.txt"));
            String[][] totalOrder = new String[7][5];
            //ProductID, ProductName, ProductPrice
            int productLine =0;
            while(productInputStream.hasNextLine()){
                    String[] input = productInputStream.nextLine().split(",");
                    totalOrder[productLine][0] = input[0];    //ProductID
                    totalOrder[productLine][1] = input[1];    //ProductName
                    totalOrder[productLine][3] = input[2];    //ProductPrice
                    productLine++;
            }
            //OrderID, ProductID, OrderQuantity
            int orderLine=0;
            while(orderInputStream.hasNextLine()){
                String[] input = orderInputStream.nextLine().split(",");
                for(int i = 0;i< totalOrder.length;i++){
                    if(totalOrder[i][0].equals(input[1])){
                        totalOrder[i][2] = input[2]; //ProductQuantity
                    }
                }

                orderLine++;
            }
            productInputStream.close();
            orderInputStream.close();
            //0)ProductID,1)ProductName,2)ProductQuantity,3)ProductPrice,4)Total
            for(String[] row: totalOrder){
                if(row[2]!=null) {
                    row[4] = String.format("%.2f", Integer.parseInt(row[2]) * Double.parseDouble(row[3]));
                }
            }

            //Display orders
            System.out.println("Product ID\tProduct Name\t\t\t Quantity\tPricePerUnit\tTotal");
            for(String[] row: totalOrder){
                if(row[2]!=null){
                    System.out.printf("%-6s\t\t%-20s\t\t%-5s\t\t%s\t\t%s\n",row[0],row[1],row[2],row[3],row[4]);
                }
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
