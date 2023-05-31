//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//        Example 1:
//
//        Input: nums= [1, 2, 3, 4]
//        Output: false
//        Explanation: There are no duplicates in the given array.
//        Example 2:
//
//        Input: nums= [1, 2, 3, 1]
//        Output: true
//        Explanation: '1' is repeating.

package DataStructureAlgo.warmup;

public class containsDuplicate1 {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; ++ i) {
            for (int j = 0; j < i; ++ j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        containsDuplicate1 solution = new containsDuplicate1();

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
