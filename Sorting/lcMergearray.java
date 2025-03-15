package Sorting;

public class lcMergearray {
    public static void main(String args[]){
        int[] num1= {1,2,3};
        int[] nums2= {2,5,6};
        int[] temp= new int[num1.length+nums2.length];
        int count=0;

        for(int i =0;i<num1.length;i++){
             temp[i]= num1[i];
            count++;
        }
        for(int j =0;j<temp.length-num1.length;j++){
            temp[count]= nums2[j];
            count++;
        }
            
        swap(temp);
        for(int x: temp){
            System.out.println(x);
        }
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
