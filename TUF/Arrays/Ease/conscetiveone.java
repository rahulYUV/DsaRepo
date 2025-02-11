package TUF.Arrays.Ease;
import java.util.*;

public class conscetiveone {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,0,1,1,1,0,1,1,1,1,1,0};
        int MaximumStreak = maxiStreak(arr);
        System.out.println(MaximumStreak);

    }
    static int maxii(int a , int b ){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int maxiStreak(int []arr){
        int n = arr.length;
        int maxi =0;
        int count=0;
        for(int i =0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;

            }
            maxi= maxii(maxi,count);

        }
        return maxi;
    }
    
}
