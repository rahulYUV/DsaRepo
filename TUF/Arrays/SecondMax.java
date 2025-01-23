
package StriveratoZ.Arrays;
import java.util.Arrays;
public class SecondMax {
    
    static int second(int[] arr){
        int size = arr.length;
        int largest = arr[0];
        int sl= Integer.MIN_VALUE;
        for(int i= 1;i<size;i++){
            if(arr[i]>largest){
                sl = largest;
                largest= arr[i];
            }
            else if(arr[i]> sl && arr[i]<largest){
                sl = arr[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
       int [] arr ={1,2,4,7,7,5};
       int secondMaxi= second(arr);
       System.out.println(secondMaxi);
    }
}
