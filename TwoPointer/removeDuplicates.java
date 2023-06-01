//Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once. The relative order of the elements should be kept the same and you should not use any extra space so that the solution has a space complexity of .
//
//        Move all the unique elements at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.
//
//        Example 1:
//
//        Input: [2, 3, 3, 3, 6, 9, 9]
//        Output: 4
//        Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
//        Example 2:
//
//        Input: [2, 2, 2, 11]
//        Output: 2
//        Explanation: The first two elements after removing the duplicates will be [2, 11].

package DataStructureAlgo.TwoPointer;

public class removeDuplicates {
    public static int remove(int[] arr) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        removeDuplicates Solution = new removeDuplicates();
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        System.out.println(Solution.remove(arr));

        arr = new int[] { 2, 2, 2, 11 };
        System.out.println(Solution.remove(arr));
    }
}
