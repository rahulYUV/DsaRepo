package array.arrayOperation;

public class largest {
    public static int  LargestElement(int[] arr ){
        int largest =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        return largest;
    }
public static void main(String args[]){
    int arr[]={10,20,30,40,50};
    int largestt = LargestElement(arr);
    System.out.println(largestt);
}

    
}
