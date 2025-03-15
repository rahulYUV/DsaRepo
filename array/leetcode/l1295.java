package array.leetcode;

public class l1295 {
    public static void main(String []args){
        int[] arr={10,20,333,4444,5555,7,98};
         int result = count(arr);
         System.out.println(result);

    }
    static int count(int[] digits){
        int result=0;
        for(int i =0;i<digits.length;i++){
            int temp = checkDigits(digits[i]);
            if(temp%2==0){
                result++;
            }

        }
        return result;
    }

    static int checkDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    
}
