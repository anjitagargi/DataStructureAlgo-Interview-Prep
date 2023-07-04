package DataStructureAlgo.TwoPointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class findSubarrayProduct{
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // TODO: Write your code here
        double product = 1;
        int left =0;
        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];
            while (product >= target && left < arr.length) {
                product /= arr[left++];
            }

            List<Integer> tempList = new LinkedList<>();
            for (int i = right; i >= left; i--) {

                tempList.add(0, arr[i]);
                result.add(new ArrayList<>(tempList));
            }
        }

        // Return the result.
        return result;
    }


    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
        System.out.println(findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
    }

}
