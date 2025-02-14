/**
 * This Java program demonstrates the usage of a 2D array.
 * 
 * A 2D array, also known as a matrix, is an array of arrays. It is useful for representing data in a grid-like structure.
 * For example, it can be used to represent a chessboard, a table of values, or the pixels in an image.
 * 
 * Why Use a 2D Array?
 * - 2D arrays are useful for storing tabular data where rows and columns are involved.
 * - They are helpful in various algorithms, such as matrix multiplication, image processing, and dynamic programming.
 * 
 * Industry Applications:
 * - Image Processing: Storing pixel values of an image.
 * - Game Development: Representing game boards (e.g., chess, tic-tac-toe).
 * - Data Science: Storing data in a tabular format for analysis.
 * - Machine Learning: Representing datasets for training models.
 * 
 * Problem-Solving Approach:
 * - Declare and initialize the 2D array.
 * - Populate the array with data (user input or predefined values).
 * - Implement logic to manipulate or process the data stored in the array.
 * 
 * Time Complexity:
 * - Accessing an element: O(1)
 * - Iterating through all elements: O(n*m) where n is the number of rows and m is the number of columns.
 * 
 * Space Complexity:
 * - The space complexity of a 2D array is O(n*m) where n is the number of rows and m is the number of columns.
 */

 import java.util.*; 

 class theory {
     public static void main(String[] args) {
         int[][] nums = new int[3][3]; // Declare a 2D array with 3 rows and 3 columns
         Scanner sc = new Scanner(System.in); // Creating a Scanner object for taking user input
 
         // Loop through each element of the 2D array to populate it with user input
         for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums[i].length; j++) { // Use nums[i].length for better readability
                //  System.out.print("Enter the elements for position [" + i + "][" + j + "]: ");
                //  nums[i][j] = sc.nextInt(); // Store user input in the array
             }
         }
         
        
                            // for(int i =0;i<nums.length;i++){
                            //     for(int j =0;j<nums.length;j++){
                            //         System.out.print(nums[i][j]);
                            //     }
                            //     System.out.println();
                            // }

            int [][]arr ={{1,2,3},{9,8,7},{4,5,6}};
            int[] ans = MinAndMax(arr);
            System.out.println(Arrays.toString(ans));
     
                        }

     public static int[] MinAndMax(int[][] nums){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i][j]>max){
                    max = nums[i][j];
                }
                if(nums[i][j]<min){
                    min= nums[i][j];
                }

            }

        }

        return new int[]{min,max};

     }







 }
 