package TUF.Arrays.Medium;

import java.util.Arrays;

public class ZeroMatrix {

    public static void main(String[] args) {
        int [][]nums={
            {1,1,0},
            {1,0,1},
            {1,1,1}
        };
        zero(nums, 3, 3);
        System.out.println("the finale mat are ");
        for(int [] x :nums){

            System.out.println(Arrays.toString(x));
        }
    }
    public static void zero(int[][] nums , int n, int  m ){
           int [] row = new int[n];
           int [] col = new int[m];
           for(int i =0;i< n;i++) {
            for(int j =0;j<m;j++){
                if(nums[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
            
           }

           for(int i =0;i < n;i++){
            for(int j =0 ; j<m ;j++){
                if((row[i] ==1) || (col[j]==1)) {
                    nums[i][j]=0;

                }
            }
           }

    }
}
