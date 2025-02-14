
public class DiagonalSum {

     public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DiagonalSumm(nums);
        
     }

     static void DiagonalSumm(int[][] arr){
        int sum =0;
        int n = arr.length;
        int primaryDiagonal=0;
        int SecondaryDiagonal=0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(i==j){
                    primaryDiagonal = primaryDiagonal+ arr[i][j];
                }
                if(i+j==n-1){
                    SecondaryDiagonal = SecondaryDiagonal+ arr[i][j];
                }
            }
        }
        System.out.println("the ps is: "+ primaryDiagonal);
        System.out.println("the ss is: "+ SecondaryDiagonal);
    }
}