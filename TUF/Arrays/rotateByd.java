package TUF.Arrays;

import java.util.Arrays;

public class rotateByd {
    static void rev(int [] arr, int start,int end){
        while (start<=end) {
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            
        }
    }       
    static void  drotate(int arr[],int d){
        int n = arr.length;
        rev(arr, 0, d);
        rev(arr, n-d, n-1);
        rev(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        drotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        
    }





}