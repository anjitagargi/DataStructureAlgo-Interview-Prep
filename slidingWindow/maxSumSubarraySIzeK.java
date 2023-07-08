package DataStructureAlgo.slidingWindow;

public class maxSumSubarraySIzeK {
    public int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int maxSum = 0;
        int currSum = 0;
        int startSum = 0;

        for (int i = 0; i < arr.length ; i++) {
                    currSum += arr[i];
             if (i>= k - 1) {
                 maxSum = Math.max(maxSum, currSum);
                 currSum-= arr[startSum];
                 startSum++;
             }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        maxSumSubarraySIzeK Solution = new maxSumSubarraySIzeK();
        System.out.println("Maximum sum of a subarray of size K: "
                + Solution.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + Solution.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
