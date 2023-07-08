package DataStructureAlgo.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static int findLength(char[] arr) {
        int maxLength = 0;
        Map<Character,Integer> charFreq = new HashMap<>();
        int start =0;
        for (int i = 0; i < arr.length; i++) {
         //
            charFreq.put(arr[i], charFreq.getOrDefault(arr[i],0)+1);
            while (charFreq.size()>2){

                charFreq.put(arr[start],charFreq.get(arr[start])-1);
                if(charFreq.get(arr[start]) == 0){
                    charFreq.remove(arr[start]);
                }
                start++;
            }
            maxLength = Math.max(maxLength, i- start+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
            FruitsIntoBaskets Solution = new FruitsIntoBaskets();
        System.out.println("Maximum number of fruits: " +
                Solution.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println("Maximum number of fruits: " +
                Solution.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }


}

