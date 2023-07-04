//Problem Statement
//        Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet. If there are more than one such triplet, return the sum of the triplet with the smallest sum.
//
//        Example 1:
//
//        Input: [-1, 0, 2, 3], target=3
//        Output: 2
//        Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
//        Example 2:
//
//        Input: [-3, -1, 1, 2], target=1
//        Output: 0
//        Explanation: The triplet [-3, 1, 2] has the closest sum to the target.
//        Example 3:
//
//        Input: [1, 0, 1, 1], target=100
//        Output: 3
//        Explanation: The triplet [1, 1, 1] has the closest sum to the target.
//        Example 4:
//
//        Input: [0, 0, 1, 1, 2, 6], target=5
//        Output: 4
//        Explanation: There are two triplets with distance '1' from target: [1, 1, 2] & [0,0, 6]. Between these two triplets, the correct answer will be [1, 1, 2] as it has a sum '4' which is less than the sum of the other triplet which is '6'. This is because of the following requirement: 'If there are more than one such triplet, return the sum of the triplet with the smallest sum.'
package DataStructureAlgo.TwoPointer;

import java.util.Arrays;

public class TripleSumTarget0 {

        public static int searchTriplet(int[] nums, int target) {

                if(nums == null || nums.length<3)
                    throw new IllegalArgumentException();

                Arrays.sort(nums);
                int smallestDifference = Integer.MAX_VALUE;
                for(int i=0; i<nums.length-2; i++){
                    int l = i+1;
                    int r = nums.length-1;

                    while (l < r) {
                        int targetdiff = target- nums[i]- nums[l]-nums[r];
                        if(targetdiff == 0) return target;

                        if (Math.abs(targetdiff) < Math.abs(smallestDifference) || (Math.abs(targetdiff) == Math.abs(smallestDifference)  && targetdiff > smallestDifference))
                            smallestDifference = targetdiff;

                        else if ( targetdiff > 0)
                            l++;

                        else
                            r--;
                    }

                }

                return target- smallestDifference;
            }


        public static void main(String[] args) {
            TripleSumTarget0 Solution = new TripleSumTarget0();
            System.out.println(
                    Solution.searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
            System.out.println(
                    Solution.searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
            System.out.println(
                    Solution.searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
            System.out.println(
                    Solution.searchTriplet(new int[] { 0, 0, 1, 1, 2, 6 }, 5));
        }
    }

