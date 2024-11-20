package l5;
import java.util.Arrays;
import java.util.Scanner;

public class l5q6 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = scanner.nextInt();

        int [][] matrix = new int[rows][rows];

        for(int x = 0; x<=matrix.length-1; x++){
            Arrays.fill(matrix[x], 0);
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                }
            }
        }

        System.out.println("The pascal Triangle with " + rows + " row(s)");
        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++)
                System.out.printf("%-6d", matrix[i][j]);

            System.out.println();
        }

    }
}
