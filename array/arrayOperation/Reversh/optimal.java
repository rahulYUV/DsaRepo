package array.arrayOperation.Reversh;

import java.util.Arrays;

public class optimal {
    public  static void main(String args[]){
        int crr[]={10,8,6,4,2};
        revArr(crr);
        System.out.println(Arrays.toString(crr));

    }
        static void revArr(int [] arr){
            int first = 0;
            int last = arr.length-1;
            while(first<last){
                arr[first]= arr[first]^arr[last];
                arr[last]= arr[first]^arr[last];
                arr[first]= arr[first]^arr[last];
                first++;
                last--;

            }
        }
    
}
