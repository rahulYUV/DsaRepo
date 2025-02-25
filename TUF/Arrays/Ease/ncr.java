package TUF.Arrays.Ease;

public class ncr {

    public static void main(String[] args) {
        System.out.println(ncr(4, 2)); // Should return 6
    }

    static long ncr(int n, int r) {
        if (r > n) return 0; // Invalid case

        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);  
            res = res / (i + 1);  
        }
        return res;
    }
}
