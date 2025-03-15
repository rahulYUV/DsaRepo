package Sorting.BubbleSort;

import java.util.Arrays;

public class base {
    static void bblesort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length-i-1;j++){
                // for each step , max item will come at the last respective inde
                if(arr[j]<arr[j-1]){
                   arr[j]=arr[j]^arr[j-1];
                   arr[j-1]=arr[j]^arr[j-1];
                   arr[j]=arr[j]^arr[j-1];
                  
                }
              
            }
            System.out.println(Arrays.toString(arr));
            
        }
       
    }
    public static void main(String[] args) {
        int[] arr={10,4,5,6,7,13,2};
        bblesort(arr);
    }
    
}
