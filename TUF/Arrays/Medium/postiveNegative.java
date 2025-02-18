package TUF.Arrays.Medium;

import java.util.Arrays;

public class postiveNegative {

        public static void main(String[] args) {
                        int nums[]={3,1,-2,-5,1,-7};
                        //    reArrange(nums);
                        lessoptimal(nums);
                        System.out.println(

                        "the optimal is "+Arrays.toString(nums)
                        );
            
        }    


        public static void lessoptimal(int[] ans){
            int length = ans.length;
            int newAns[] = new int[length];
            int pos =0,neg =0;
            for(int i =0;i<length;i++){
                if(ans[i]>=0){
                    newAns[pos] = ans[i];
                    pos +=2;

                }
                else{
                    newAns[neg] = ans[i];
                    neg +=2;
                }
            }
            ans = newAns;
            
        }
    public static void reArrange(int [] nums){
        int length = nums.length;
        int[] pos  = new int[length/2];
        int[] neg = new int[length/2];
        int posIndex =0;
        int negIndex =0;
        for(int i =0;i<length;i++){
            if(nums[i]>=0){
                pos[posIndex++]= nums[i];

            }
            else{
                neg[negIndex++]= nums[i];
            }
        }

        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));


        for(int i =0;i<length/2;i++){
            nums[2*i] = pos[i];
            nums[(2*i)+1] = neg[i];
         }
         System.out.println(Arrays.toString(nums));
    }
}
