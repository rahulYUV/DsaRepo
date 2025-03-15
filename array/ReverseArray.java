import java.util.*;

/*
Approach: Two-Pointer Technique
- Use two pointers: left (0) and right (n-1).
- Swap elements symmetrically from both ends.
- Stop when left >= right.

Time Complexity: O(n)  -> Linear time complexity.
Space Complexity: O(1) -> No extra space used.
*/

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        // Swapping elements until the middle is reached
        while (left < right) {
            // Swap elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);
    }
}
