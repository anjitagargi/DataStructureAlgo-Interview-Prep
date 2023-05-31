//Problem Statement
//        Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//        You must not use any built-in exponent function or operator.
//
//        For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//        Example 1:
//
//        Input: x = 8
//        Output: 2
//        Explanation: The square root of 8 is 2.8284, and since we need to return the floor of the square root (integer), hence we returned 2.
//        Example 2:
//
//        Input: x = 4
//        Output: 2
//        Explanation: The square root of 4 is 2.
//        Example 3:
//
//        Input: x = 2
//        Output: 1
//        Explanation: The square root of 2 is 1.414, and since we need to return the floor of the square root (integer), hence we returned 1.
package DataStructureAlgo.warmup;

public class sqrt {
    public int mySqrt(int x) {
        if(x<2)
            return x;

        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high) {
            int mid;
            mid = (low + high) / 2;

            int sqr = mid * mid;
            if(sqr == x) return mid;
            else if(sqr > x) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }

        }
        return ans;

    }
        public static void main (String[]args){
            sqrt solution = new sqrt();
            int input1 = 4;
            int expectedOutput1 = 2;
            int result1 = solution.mySqrt(input1);
            System.out.println(result1 == expectedOutput1); // Expected output: true

            int input2 = 8;
            int expectedOutput2 = 2;
            int result2 = solution.mySqrt(input2);
            System.out.println(result2 == expectedOutput2); // Expected output: true

            int input4 = 2;
            int expectedOutput4 = 1;
            int result4 = solution.mySqrt(input4);
            System.out.println(result4 == expectedOutput4); // Expected output: true

            int input5 = 3;
            int expectedOutput5 = 1;
            int result5 = solution.mySqrt(input5);
            System.out.println(result5 == expectedOutput5); // Expected output: true

            int input6 = 15;
            int expectedOutput6 = 3;
            int result6 = solution.mySqrt(input6);
            System.out.println(result6 == expectedOutput6); // Expected output: true
        }
        }


// different approach

//        if (x < 2)
//            return x;
//
//        int left = 2, right = x / 2;
//        int pivot;
//        long num; // use long to store result of pivot * pivot to prevent overflow
//        while (left <= right) { // binary search for the square root
//            pivot = left + (right - left) / 2; // find the middle element
//            num = (long) pivot * pivot;
//            if (num > x)
//                right = pivot - 1; // if pivot * pivot is greater than x, set right to pivot - 1
//            else if (num < x)
//                left = pivot + 1; // if pivot * pivot is less than x, set left to pivot + 1
//            else
//                return pivot; // if pivot * pivot is equal to x, return pivot
//



