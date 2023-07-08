package DataStructureAlgo.slidingWindow;

public class smallestSubarrayWithaGreaterSum {
    public static int findMinSubArray(int S, int[] arr) {
        int currSum = 0,minValue = Integer.MAX_VALUE;
        int start=0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            while(currSum >= S){
                minValue = Math.min(minValue, i - start + 1);
                currSum-= arr[start];
                start++;
            }

        }
        return minValue == Integer.MAX_VALUE ? 0 : minValue;
    }

    public static void main(String[] args) {

        smallestSubarrayWithaGreaterSum Solution = new smallestSubarrayWithaGreaterSum();
        int result = Solution.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = Solution.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = Solution.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
    }

}
