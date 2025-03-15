package TUF.Arrays.Medium;

public class MatrixZero {

    public static void main(String[] args) {
        
        int[][]nums ={
            {1,1,0},
            {1,0,1},
            {1,1,1}
        };








    }
            // helper function 
         
        public static void MarkZero(int[][] nums){
            for(int i =0;i<nums.length;i++){
                for(int j =0;j<nums[i].length;j++){
                    if(nums[i][j]==0){
                        markRow(i);
                        markRow(j);
                    }
                }
            }
        }    
}
