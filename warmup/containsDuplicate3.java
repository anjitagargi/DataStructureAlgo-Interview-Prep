//Approach 3: Sorting
//        Another approach is to sort the array first and then check for duplicates.
//
//        We'll sort the array and then iterate through it, comparing each element with the next one.
//
//        If any two elements are the same, we'll return true. If we've gone through the entire array and haven't found any duplicates, we'll return false.

package DataStructureAlgo.warmup;
import java.util.Arrays;

public class containsDuplicate3 {

    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums); // sort the array
        // use a loop to compare each element with its next element
        for (int i = 0; i < nums.length - 1; i++) {
            // if any two elements are the same, return true
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false; // if no duplicates are found, return false
    }
    public static void main(String[] args) {
        containsDuplicate3 solution = new containsDuplicate3();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
    }
}
