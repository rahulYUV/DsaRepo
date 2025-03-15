package Praticee;

import java.util.Arrays;

public class battle {

        public static void main(String[] args) {
               // reversh an array ;
                    int[] nums ={10,20,30,40,500,1};

                    // System.out.println(kitneEvenNohain(nums));
                    
                    // rev(nums);
                    
        }

            
        static int kitneEvenNohain(int[] arr){
            int count=0;
            int length = arr.length;
            for(int i =0;i<length;i++){
                int digit = countt(arr[i]);
                if(digit % 2 == 0)count++;
            
            }

                return count;            
        }
        public static int countt(int n ){
            int count =0;
            while(n>0){
                count++;
                n = n/10;

            }
            return count;
        }














            static void rev(int arr[]){
                int size = arr.length;
                int left =0;
                int right =size-1;
                while (left<right) {
                    arr[left] = arr[left]^arr[right];
                    arr[right] = arr[left]^arr[right];
                    arr[left] = arr[left]^arr[right];
                    left++;
                    right--;

                    
                }
            }
  
}
