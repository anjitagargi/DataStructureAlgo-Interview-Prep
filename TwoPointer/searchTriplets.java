package DataStructureAlgo.TwoPointer;
import java.util.*;

public class searchTriplets {

    private  static int searchPair(int[] arr, int targetSum, int first){
        int count=0;
        int left = first +1,right = arr.length -1;
        while(left<right){
            if (arr[left] + arr[right] < targetSum){
                count+= right - left;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }

    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length -2 ; i++) {
            count+= searchPair(arr, target-arr[i],i);

        }
        return count;
    }

    public static void main(String[] args) {
        searchTriplets Solution = new searchTriplets();
        System.out.println(
                Solution.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(
                Solution.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}
