package array.arrayOperation;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String args[]){
        // operation in arrays ->
        // create;
        // input 
        // output 
        // udate
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int[] arr1={1,2,3,4};
        int arr2[];
        arr2= new int[8];
        System.out.println(arr2.length);
       
        String fruits[] ={"apple ", "mango","a"};
        int[] brr = new int[5];
        for(int i =0;i<brr.length;i++){
            brr[i]= sc.nextInt();
        }
        for(int x : brr){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(brr));
    }
    
}
