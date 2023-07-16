package DataStructureAlgo.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class permutationinString {
    public static boolean findPermutation(String str, String pattern) {
    int windowStart = 0, matched = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char ch: pattern.toCharArray()) {
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch,0)+1);
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFreqMap.containsKey(rightChar)) {
                charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
                if (charFreqMap.get(rightChar) == 0)
                    matched++;
            }
            if (matched == charFreqMap.size())
                return true;

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);
                if (charFreqMap.containsKey(leftChar)) {
                    if (charFreqMap.get(leftChar) == 0)
                        matched--;
                    charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        permutationinString Solution = new permutationinString();
        System.out.println("Permutation exist: "
                + Solution.findPermutation("oidbcaf", "abc"));
        System.out.println("Permutation exist: "
                + Solution.findPermutation("odicf", "dc"));
        System.out.println("Permutation exist: "
                + Solution.findPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println("Permutation exist: "
                + Solution.findPermutation("aaacb", "abc"));
    }
}
