package TUF.Arrays.Medium;

public class MissingNumber {
    public static void main(String[] args) {
        int[] brr = {1, 2, 4,5}; 
        int missing = missNo(brr, 5);
        System.out.println("The missing number is: " + missing);
    }

    static int missNo(int[] arr, int n) {
        int flag;
        for (int i = 1; i <= n; i++) { 
            flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1; // If there is'nt missing then , return -1
    }
}
