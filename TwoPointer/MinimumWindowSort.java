package DataStructureAlgo.TwoPointer;

public class MinimumWindowSort {

    public static int sort(int[] arr){
        int low=0;
        int high = arr.length - 1;

        while(low < arr.length-1 && arr[low] <= arr[low+1])
            low++;

        if(low== arr.length -1)
            return 0;

        while(high>0 && arr[high] >= arr[high-1])
            high--;

        int subarrayMin = Integer.MAX_VALUE, subarrayMax = Integer.MIN_VALUE;

        for (int k = low; k <=high; k++) {
            subarrayMax = Math.max(subarrayMax, arr[k]);
            subarrayMin = Math.min(subarrayMin,arr[k]);
        }

        while(low>0 && arr[low-1] > subarrayMin)
            low--;

        while (high< arr.length-1 && arr[high+1] < subarrayMax)
            high++;

        return high-low+1;
    }


    public static void main(String[] args) {
         MinimumWindowSort Solution = new MinimumWindowSort();
        System.out.println(Solution.sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
        System.out.println(Solution.sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
        System.out.println(Solution.sort(new int[] { 1, 2, 3 }));
        System.out.println(Solution.sort(new int[] { 3, 2, 1 }));
    }
}
