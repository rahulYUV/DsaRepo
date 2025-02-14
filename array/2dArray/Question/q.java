package Question;

public class q {
    // second row 
     public static void main(String[] args) {
        int [][]num ={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        int sum =0;
        for(int i =1;i<=1;i++){
            for(int j =0;j<=num[1].length;j++) {

                sum = sum + num[i][j];
                System.out.println("the current sum is "+ sum);
                
            }
            
        }

        System.out.println("sum is : " +sum);
     }

    
}
