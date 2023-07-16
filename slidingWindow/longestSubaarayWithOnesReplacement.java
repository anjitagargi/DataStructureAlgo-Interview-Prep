package DataStructureAlgo.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class longestSubaarayWithOnesReplacement {
    public static int findLength(int[] arr, int k) {
        int windowStart = 0, maxLength = 0, maxOnesCount = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] == 1)
                maxOnesCount++;
            if (windowEnd - windowStart + 1 - maxOnesCount > k) {
                if (arr[windowStart] == 1)
                    maxOnesCount--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        longestSubaarayWithOnesReplacement Solution = new longestSubaarayWithOnesReplacement();
        System.out.println(
                Solution.findLength(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));
        System.out.println(
                Solution.findLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 }, 3));
    }
}

