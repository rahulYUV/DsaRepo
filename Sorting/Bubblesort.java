 package Sorting;

import java.util.Arrays;

class Bubblesort {
    
    public static void main(String args[]){
        int[] arr ={5,4,3,2,1};
       int count =  swap(arr);
       System.out.println("the counter is : "+ count);
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int swap(int arr[]){
        boolean flag = false;
        int count=0;

        for(int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length-i-1;j++){
                // for each step , max item will come at the last respective inde
                if(arr[j]<arr[j-1]){
                   arr[j]=arr[j]^arr[j-1];
                   arr[j-1]=arr[j]^arr[j-1];
                   arr[j]=arr[j]^arr[j-1];
                    flag= true;
                }
                count++;
            }
            
        }
        return count;
    }
   

    
}