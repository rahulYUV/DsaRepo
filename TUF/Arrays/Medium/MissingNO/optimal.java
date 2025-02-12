package TUF.Arrays.Medium.MissingNO;

public class optimal {
    public static void main(String[] args) {
        int nums[]={1,3,2,0,5};
        int miss = sumOpt(nums, 5);
        System.out.println(miss);
    }
    static int sumOpt(int[] arr,int n) {
        int sum = (n*(n+1))/2;
        int sum1=0;
        for(int i =0;i<n;i++){
            sum1 = sum1+arr[i];

        }
        return sum-sum1;
    }
    
}
