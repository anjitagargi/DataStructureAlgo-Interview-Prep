package DataStructureAlgo.slidingWindow;

import java.util.*;

public class stringAnagrams {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        int windowStart = 0, matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray())
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);
        List<Integer> resultIndices = new ArrayList<Integer>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) == 0)
                    matched++;
            }
            if (matched == charFrequencyMap.size()) // have we found an anagram?
                resultIndices.add(windowStart);

            if (windowEnd >= pattern.length() - 1) { // shrink the window
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0)
                        matched--; // before putting the character back, decrement the matched count
                    // put the character back
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }

        return resultIndices;
    }

    public static void main(String[] args) {
        stringAnagrams Solution = new stringAnagrams();
        System.out.println(Solution.findStringAnagrams("ppqp", "pq"));
        System.out.println(Solution.findStringAnagrams("abbcabc", "abc"));
    }

}
