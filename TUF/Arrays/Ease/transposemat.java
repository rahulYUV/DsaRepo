package TUF.Arrays.Ease;

import java.util.Arrays;

public class transposemat {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {
                7,8,9
            }
        };
        transpose(matrix);
        for(int x[]:matrix){
            System.out.println(Arrays.toString(x));
        }

    }
    // the transpose function 
            public static void transpose(int[][] mat ){
                int size = mat.length;
                for(int i =  0;i<size;i++){
                    for(int j =i;j<size;j++){
                        int temp =0;
                        temp = mat[i][j];
                        mat[i][j]= mat[j][i];
                        mat[j][i]= temp;
                    }
                }
            }
    
}
