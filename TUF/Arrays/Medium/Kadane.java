package TUF.Arrays.Medium;
import java.util.*;

public class Kadane {
    
    public static void main(String[] args) {
        // Test cases
        int[] nums = {1, -2, 2, -2, 3, 4, 5, -7, 7};
        System.out.println("Optimal Approach Result: " + optimalKadane(nums));
        // System.out.println("Optimal Approach Result: revesion ++; " + optimalKadane(nums));
        // System.out.println("Brute Force Result: " + bruteForceKadane(nums));
                    // SubArray(nums);
        System.out.println(reVision(nums));
    }
    
            // print s subArrauy
            // the optimal 

            public static int Optimal(int[] arr){
                int size = arr.length;
                int MaxSum =Integer.MIN_VALUE;
                for(int i =0;i<size;i++){
                    int currSum =+ arr[i];
                    MaxSum = Math.max(currSum,MaxSum);
                    if(currSum<0){
                        currSum = 0;

                    }
                
                }
                return MaxSum;

            }


            // to print sub Array possible

            static void SubArray(int[] nums){
                int length = nums.length;
                for(int i =0;i< length;i++){
                    for(int j =0;j< length;j++){
                        for(int k = j ;k<=j;k++){
                            System.out.print(nums[k]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }

    // Optimal approach using Kadane’s Algorithm (O(n) Time Complexity)
    public static int optimalKadane(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: Empty array

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            
            // Reset sum if it goes negative
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    
    // Brute force approach (O(n^2) Time Complexity)
    public static int bruteForceKadane(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; // Edge case: Empty array

        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
    
    /*
    * Conclusion:
    * 1. Kadane’s Algorithm efficiently finds the maximum sum subarray in O(n) time.
    * 2. It works by maintaining a running sum and resetting it if it turns negative.
    * 3. Brute force is slower (O(n^2)) and should only be used for small input sizes.
    * 4. Edge cases include empty arrays and arrays with all negative numbers.
    * 5. The if condition (sum < 0) is used to reset the sum because a negative sum
    *    would reduce the maximum subarray sum. Resetting helps to start fresh from
    *    a potential new maximum subarray.
    *
    * Conclusion (Hinglish):
    * 1. Kadane ka Algorithm ek efficient tarika hai maximum sum subarray find karne ka, jo O(n) time me kaam karta hai.
    * 2. Yeh ek running sum maintain karta hai aur agar sum negative ho jaye to usko reset karta hai.
    * 3. Brute force approach slow hai (O(n^2)) aur sirf chhoti input sizes ke liye use karni chahiye.
    * 4. Edge cases me empty array aur pure negative numbers wale arrays shamil hote hain.
    * 5. If condition (sum < 0) isliye use hoti hai kyunki negative sum maximum subarray sum ko kam kar sakta hai. Isliye, usko reset karna better hota hai taaki naye subarray ka calculation shuru kiya ja sake.
    */



    //** REVISION  */

    public static int reVision(int[] nums){
        int length = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<length;i++){
            sum = 0;
            for(int j =i;j<length;j++){
                sum  = sum+ nums[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}
