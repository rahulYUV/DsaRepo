package array.arrayOperation;

public class largest{

    /**
     * Optimized approach to find the largest element in the array.
     * This approach iterates through the array once.
     * Time Complexity: O(n), as we traverse the array once.
     * Space Complexity: O(1), as no extra space is used.
     */
    public static int findLargestOptimized(int[] arr) {
        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // If current element is greater than max, update max
                max = arr[i];
            }
        }
        return max; // Returning the largest element
    }

    /**
     * Brute-force approach to find the largest element in the array.
     * This approach sorts the array and picks the last element.
     * Time Complexity: O(n log n), as sorting takes O(n log n) time.
     * Space Complexity: O(1), if in-place sorting is used.
     */
    public static int findLargestBruteForce(int[] arr) {
        // Sort the array (in ascending order)
        java.util.Arrays.sort(arr);
        return arr[arr.length - 1]; // Return the last element (largest)
    }

    public static void main(String args[]) {
        // Example array
        int arr[] = {10, 20, 30, 40, 50, 51, 49};

        // Calling the optimized function to find the largest element
        int largestOptimized = findLargestOptimized(arr);
        System.out.println("Largest element (Optimized approach): " + largestOptimized);

        // Calling the brute-force function to find the largest element
        int largestBruteForce = findLargestBruteForce(arr);
        System.out.println("Largest element (Brute-force approach): " + largestBruteForce);
    }
}
