//Problem Statement
//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//        Example 1:
//
//        Input: s = "listen", t = "silent"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
//        Example 3:
//
//        Input: s = "hello", t = "world"
//        Output: false

package DataStructureAlgo.warmup;

import java.util.Arrays;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);

        if(sortedstr1.equals(sortedstr2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        isAnagram sol = new isAnagram();

        // Test case 1
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(sol.isAnagram(s1, t1)); // Expected output: true

        // Test case 2
        String s2 = "hello";
        String t2 = "world";
        System.out.println(sol.isAnagram(s2, t2)); // Expected output: false

        // Test case 3
        String s3 = "anagram";
        String t3 = "nagaram";
        System.out.println(sol.isAnagram(s3, t3)); // Expected output: true

        // Test case 4
        String s4 = "rat";
        String t4 = "car";
        System.out.println(sol.isAnagram(s4, t4)); // Expected output: false

        // Test case 5
        String s5 = "";
        String t5 = "";
        System.out.println(sol.isAnagram(s5, t5)); // Expected output: true
    }
}
