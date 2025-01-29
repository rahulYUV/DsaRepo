package TUF.Arrays;
import java.util.*;

public class moveZeroInEnd {
    static void moveZero(int[] arr){
        int count=0;
       int[] temp=  new int[arr.length];
       for(int i =0;i<arr.length;i++){
        if(arr[i]!=0){
           temp[count]=arr[i];
           count++;

        }

       }
       int tempSize = count;
       for(int i =0;i<count;i++){
            arr[i]= temp[i];
       }
       for(int i =tempSize;i<arr.length;i++){
        arr[i]=0;
       }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,0,3,0,4,0,5};
        moveZero(arr);
        for(int x: arr){
            System.out.println(x);
        }
        
    }
    
}
