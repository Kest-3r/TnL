package l5;

public class l5q4 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("3 by 3 Matrix");
        for(int i = 0; i<=matrix.length-1; i++){
            for(int j = 0; j<=matrix[i].length-1; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        //transposition
        int[][] matrix2 = new int[matrix.length][matrix[0].length];

        for(int i=0,k = matrix.length-1; i<=matrix.length-1; i++,k--){
            for (int j=matrix[i].length-1; j>=0; j--){
                matrix2[j][k] = matrix[i][j] ;
            }
        }

        for(int i = 0; i<=matrix2.length-1; i++){
            for(int j = 0; j<=matrix2[i].length-1; j++)
                System.out.print(matrix2[i][j] + " ");

            System.out.println();
        }
    }
}
