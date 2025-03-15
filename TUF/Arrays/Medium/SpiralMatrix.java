package TUF.Arrays.Medium;

class SpiralMatrix {

    public static void main(String[] args) {
        int [][] mat={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int [][] matrix={
            {1,2,3,4},{5,6,7,8},{8,9,10,11}
        };


            Spiral(matrix);
            Spiral(mat);
    }
    
     public static void Spiral(int[][] matrix ){
        int dir = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix.length;
        int top = 0;
        while(top <= bottom && left <=right ){
                    // let travers to left to right 
                    if(dir ==0){
                        for(int i =left;i<=right;i++){
                            System.out.println(matrix[top][i]);
                        }
                        // top goes down 
                        top++;
                    }
                    else if(dir == 1){// top to down 
                        for(int i= top ;i<=bottom;i++){
                            System.out.println(matrix[i][right]);
                        }
                        // inner in the boundry 
                        right--;
                    }
                    else if(dir ==2){// think opposite to the direction of 0,
                        for( int i = right;i<=left;i++ ){
                            System.out.println(matrix[bottom][i]);

                        }
                        bottom--;
                    }
                    else if(dir == 3){
                        for(int i = bottom;i<=top;i++){
                            System.out.println(matrix[i][left]);
                            left--;
                        }
                    }
                    dir = (dir+1 )% matrix.length;
        }
     }
}