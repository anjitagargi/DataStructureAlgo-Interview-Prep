//Problem Statement
//        Given an array of strings words and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
//
//        Example 1:
//
//        Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
//        Output: 5
//        Explanation: The distance between "fox" and "dog" is 5 words.
//        Example 2:
//
//        Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
//        Output: 1
//        Explanation: The shortest distance between "a" and "b" is 1 word. Please note that "a" appeared twice.
//        Example 3:
//
//        Input: words = ["a", "b", "c", "d", "e"], word1 = "a", word2 = "e"
//        Output: 4
//        Explanation: The distance between "a" and "e" is 4 words.

package DataStructureAlgo.warmup;

public class shortestDistance {

    public int shortestDistance(String[] words, String word1, String word2) {
        int shortestDistance = words.length;
        int position1 = -1, position2 = -1;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                position1 = i;
            } else if (word.equals(word2)) {
                position2 = i;
            }
            if (position1 != -1 && position2 != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(position1 - position2));
            }
        }
        return shortestDistance;
    }


    public static void main(String[] args) {

        shortestDistance solution = new shortestDistance();

        // Test case 1
        String[] words1 = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word11 = "fox";
        String word21 = "dog";
        int expectedOutput1 = 5;
        int actualOutput1 = solution.shortestDistance(words1, word11, word21);
        System.out.println("Test case 1: " + (expectedOutput1 == actualOutput1));

        // Test case 2
        String[] words2 = { "a", "b", "c", "d", "a", "b" };
        String word12 = "a";
        String word22 = "b";
        int expectedOutput2 = 1;
        int actualOutput2 = solution.shortestDistance(words2, word12, word22);
        System.out.println("Test case 2: " + (expectedOutput2 == actualOutput2));

        // Test case 3
        String[] words3 = { "a", "c", "d", "b", "a" };
        String word13 = "a";
        String word23 = "b";
        int expectedOutput3 = 1;
        int actualOutput3 = solution.shortestDistance(words3, word13, word23);
        System.out.println("Test case 3: " + (expectedOutput3 == actualOutput3));

        // Test case 4
        String[] words4 = { "a", "b", "c", "d", "e" };
        String word14 = "a";
        String word24 = "e";
        int expectedOutput4 = 4;
        int actualOutput4 = solution.shortestDistance(words4, word14, word24);
        System.out.println("Test case 4: " + (expectedOutput4 == actualOutput4));
    }

}
