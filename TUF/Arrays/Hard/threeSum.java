package TUF.Arrays.Hard;

public class threeSum {
   public static void main(String[] args) {
    int nums[]={-1,0,1,2,-1,-4}; 
    triplet(nums);
   }
   public static void triplet(int nums[]){
    for(int i =0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k = j+1;j<nums.length;j++){
                System.out.println(nums[i]+"" +nums[j]+" "+nums[k]);

            }
        }
    }
   }
}
