package DataStructureAlgo.slidingWindow;
import java.util.*;

public class smallestWindowSubstring {
    public static String findSubstring(String str, String pattern) {
        // TODO: Write your code here
        int windowStart = 0, matched = 0, minLength = str.length() + 1, subStrStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray())
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) >= 0)
                    matched++;
            }
            while (matched == pattern.length()) {
                if (minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subStrStart = windowStart;
                }

                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0)
                        matched--;
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }

        return
                minLength > str.length() ? "" : str.substring(subStrStart, subStrStart + minLength);
    }


    public static void main(String[] args) {
        smallestWindowSubstring Solution = new smallestWindowSubstring();
        System.out.println(Solution.findSubstring("aabdec", "abc"));
        System.out.println(Solution.findSubstring("aabdec", "abac"));
        System.out.println(Solution.findSubstring("abdbca", "abc"));
        System.out.println(Solution.findSubstring("adcad", "abc"));
    }
}