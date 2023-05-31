//        Problem Statement
//        A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//        Given a string sentence containing English letters (lower or upper-case), return true if sentence is a pangram, or false otherwise.
//
//        Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.
//
//        Example 1:
//
//        Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
//        Output: true
//        Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.
//        Example 2:
//
//        Input: sentence = "This is not a pangram"
//        Output: false
//        Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.


package DataStructureAlgo.warmup;

import java.util.HashSet;
import java.util.Set;

public class pangram {

    public boolean checkIfPangram(String Sentence){
        Set<Character> set = new HashSet<>();
        for (char ch: Sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);

            if (ch >= 'A' && ch <= 'Z')
                ch = Character.toLowerCase(ch);
                set.add(ch);
        }

        if(set.size() == 26) return true;
        else return false;
    }

    public static void main(String[] args) {
        pangram sol = new pangram();

        // Test case 1: "TheQuickBrownFoxJumpsOverTheLazyDog"
        // Expected output: true
        System.out.println(sol.checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));

        // Test case 2: "This is not a pangram"
        // Expected output: false
        System.out.println(sol.checkIfPangram("This is not a pangram"));

        // Test case 3: "abcdef ghijkl mnopqr stuvwxyz"
        // Expected output: true
        System.out.println(sol.checkIfPangram("abcdef ghijkl mnopqr stuvwxyz"));

        // Test case 4: ""
        // Expected output: false
        System.out.println(sol.checkIfPangram(""));

        // Test case 5: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        // Expected output: true
        System.out.println(sol.checkIfPangram("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
