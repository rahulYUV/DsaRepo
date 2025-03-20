 package TUF.Arrays.Ease;

class majorityElement {



            public static void main(String[] args) {
                int []arr = {3,2,3};
             System.out.println(Major(arr));
                

            }
            public static int Major(int []nums){
                int count = Integer.MIN_VALUE;
                int RealCount  = Integer.MIN_VALUE;
                int n = nums.length;
                for(int i=0;i<n;i++){
                    count =0;
                    for(int j =0;j<n;j++){
                        if(nums[i]==nums[j]){
                            count++;
                        }
                    }
                     RealCount= Math.max(count,RealCount);
                    
                    }
                    return RealCount;
            }

     
}