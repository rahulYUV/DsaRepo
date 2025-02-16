package TUF.Arrays.Ease;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7};

        // Brute Force Approach
        int[] bruteForceResult = removeBruteForce(nums);
        System.out.println("Brute Force Result: " + Arrays.toString(bruteForceResult));

        // Better Approach
        int[] betterApproachResult = removeBetter(nums);
        System.out.println("Better Approach Result: " + Arrays.toString(betterApproachResult));

        // Optimal Approach
        int newLength = removeOptimal(nums);
        System.out.println("Optimal Approach Result: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }

    /**
     * Brute Force Approach:
     * - Uses an additional array to store unique elements.
     * - Time Complexity: O(n^2)
     * - Space Complexity: O(n)
     */
    public static int[] removeBruteForce(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }
        return Arrays.copyOf(result, index);
    }

    /**
     * Better Approach:
     * - Uses a HashSet to store unique elements.
     * - Time Complexity: O(n)
     * - Space Complexity: O(n)
     */
    public static int[] removeBetter(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    /**
     * Optimal Approach:
     * - Uses two-pointer technique to remove duplicates in-place.
     * - Time Complexity: O(n)
     * - Space Complexity: O(1)
     */
    public static int removeOptimal(int[] arr) {
        int i = 0;
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }
        return i + 1;
    }
}
