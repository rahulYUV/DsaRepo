package TUF.Arrays;

import java.util.Arrays;

import array.arrayOperation.Reversh.optimal;

public class moveZerooptimal {
    //two pointer approach;
        static void optimal(int[] arr){
            int n = arr.length;
            int j=0;
            for(int i =0;i<n;i++){
                if(arr[i]!=0){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                    j++;
                }
            }
        }
    public static void main(String[] args) {
        int[] arr={0,1,9,8,4,0,0,2,7,0,6,0};
        optimal(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
