
//Approach 2: Using Hash Set
//        We can use the set data structure to check for duplicates in an array.
//
//        Since a set can only hold unique elements, we can check if the elements in the given array are present more than once by adding them to a set. This way, we can determine if there are any duplicates in the array.
//
//        This approach works as follows:
//
//        A set named unique_set is created to store unique elements.
//
//        The algorithm then iterates through the input array nums.
//
//        For each element "x" in the array, the algorithm checks if "x" is already in the unique_set.
//
//        If "x" is in the unique_set, then the algorithm returns True, indicating that a duplicate has been found.
//
//        If "x" is not in the unique_set, then the algorithm adds "x" to the unique_set.
//
//        The iteration continues until all elements in the array have been processed.
//
//        If no duplicates are found, the algorithm returns False.
//
//        This approach utilizes the property of sets to store only unique elements, making it an efficient solution for finding duplicates in an array.

package DataStructureAlgo.warmup;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate2 {

        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>(); // Use HashSet to store unique elements
            for (int x : nums) {
                if (!set.add(x)) // If the set already contains the current element, return true
                    return true;
            }
            return false; // Return false if no duplicates found
        }
        public static void main(String[] args) {
            containsDuplicate2 solution = new containsDuplicate2();

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




