package TUF.Arrays.Medium;
import java.util.*;

public class LongestConsecutive {
    public static boolean ls(int[] nums,int target){
        for(int i =0;i< nums.length;i++){
            if(nums[i] == target) return true;
        }
        return false;
    }
    public static int longestContinue(int[] nums){
        int largest =1;
        
        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            int count =1;
            while ((ls(nums, x+1))==true) {
                count  = count+1;
                x +=1;
                
            }
            largest = Math.max(largest, count);
        }
        return largest;

    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,7,3,8};
        System.out.println(longestContinue(nums));
        //this is new

    }
}





