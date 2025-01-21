package array.arrayOperation.Reversh;

import java.util.Arrays;

public class bruteforce {
    static void reversh(int arr[]){
        int size = arr.length;
        int[] temp = new int[size];
        int k =0;
        for(int i = size-1;i>=0;i--){
            temp[i]= arr[k];
            k++;
        }
        for(int j =0;j<temp.length;j++){
            arr[j]= temp[j];
        }

    }
    public static void main(String args[]){
        int[] arr ={10,20,30,40,50};
        reversh(arr);
        System.out.println(Arrays.toString(arr));
    }
}
