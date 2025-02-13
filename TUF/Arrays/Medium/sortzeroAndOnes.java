package TUF.Arrays.Medium;

import java.util.Arrays;

public class sortzeroAndOnes{
    public static void main(String[] args) {
        int[] arr ={0,1,2,0,2,0,0,1,2,0,2,2,1,0};
        numsSorting(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void numsSorting(int[] arr){
        int n = arr.length;
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
    }

    for(int i =0;i<count0;i++){
        arr[i]=0;
    }
    for(int i= count0;i<count0+count1;i++){
        arr[i]=1;
    }
    for(int i =count1 + count0;i<n;i++){
        arr[i]= 2;
    }

}
}
