package TUF.Arrays.Medium;

import java.util.Arrays;

public class TwoSum {
    


    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};

        int no = Tosum(arr,13);
        System.out.println(no);

    }
    // two Sum 
    static int Tosum(int[] arr,int target){
    Arrays.sort(arr);
    int left = 0,right = arr.length-1;
    while(left<right){
        int sum = arr[left] + arr[right];
        if(sum == target){
            return 1;

        }
        else if (sum < target){
            left++;
        }
        else{
            right--;

        }
    }
    
    return 0;
}
}
