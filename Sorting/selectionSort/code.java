package Sorting.selectionSort;

import java.util.Arrays;

public class code {
    static void Ssort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini =j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i]= temp;


            
        }
        System.out.println(Arrays.toString(arr));
       
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        Ssort(arr);
        
    }
    
}
