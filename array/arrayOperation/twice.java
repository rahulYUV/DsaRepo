package array.arrayOperation;

public class twice {
    public static void main(String[] args){
        
        int[] arr ={1,2,3,4,4};
        boolean flag = findtwice(arr);
        System.out.println(flag);


    }
    static boolean findtwice(int[] arr){
        boolean flag =false;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                   return true;
                }
             
            }
           
        }
        
            return false;
      


    }
  
    
}
