package TUF.Arrays.Ease;

public class SortedOrNot{

  
    public static void main(String[] args) {
        int nums[]={1,1,2,3,4,6};

        System.out.println(sorted(nums));
    }
    public static boolean sorted(int[] arr){
        boolean flag = true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false ;
                return flag;
            }
        }
        return true ;
        
    }

}