package DataStructureAlgo.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringwithKDistinctCharacter {
    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0 || str.length() < k)
            throw new IllegalArgumentException();

        int maxLength = 0;
        Map<Character,Integer> charFreq = new HashMap<>();

        int start =0;
        for (int i = 0; i < str.length(); i++) {
            char rightChar = str.charAt(i);
            charFreq.put(rightChar,charFreq.getOrDefault(rightChar,0)+1);

            while (charFreq.size()>k){
                char leftChar = str.charAt(start);
                charFreq.put(leftChar, charFreq.get(leftChar)-1);
                if(charFreq.get(leftChar) == 0){
                    charFreq.remove(leftChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, i- start+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        longestSubstringwithKDistinctCharacter Solution = new longestSubstringwithKDistinctCharacter();
        System.out.println("Length of the longest substring: "
                + Solution.findLength("araaci", 2));
        System.out.println("Length of the longest substring: "
                + Solution.findLength("araaci", 1));
        System.out.println("Length of the longest substring: "
                + Solution.findLength("cbbebi", 3));
    }

}
