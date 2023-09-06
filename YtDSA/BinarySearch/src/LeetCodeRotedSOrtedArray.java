public class LeetCodeRotedSOrtedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target)); // Output: 4
    }

    public static int search(int[] nums, int target) {
        // Initialize pointers for the binary search
        int left = 0; // Pointer for the start of the search range
        int right = nums.length - 1; // Pointer for the end of the search range

        // Perform binary search
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Check if the middle element is equal to the target
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            }

            // Determine which part of the array is sorted (left or right)
            if (nums[left] <= nums[mid]) { // Left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    // Target is in the left sorted part, adjust the right pointer
                    right = mid - 1;
                }
                else {
                    // Target is in the right unsorted part, adjust the left pointer
                    left = mid + 1;
                }
            }
            else { // Right part is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    // Target is in the right sorted part, adjust the left pointer
                    left = mid + 1;
                } else {
                    // Target is in the left unsorted part, adjust the right pointer
                    right = mid - 1;
                }
            }
        }

        // Target not found in the array
        return -1;
    }
}