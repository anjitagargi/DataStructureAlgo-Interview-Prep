//Problem Statement
//        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//        Example 1:
//
//        Input: sentence = "A man, a plan, a canal, Panama!"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: sentence = "Was it a car or a cat I saw?"
//        Output: true
//        Explanation: Explanation: "wasitacaroracatisaw" is a palindrome.

package DataStructureAlgo.warmup;

public class isPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        isPalindrome sol = new isPalindrome();

        // Test case 1: "A man, a plan, a canal, Panama!"
        // Expected output: true
        System.out.println(sol.isPalindrome("A man, a plan, a canal, Panama!"));

        // Test case 2: "race a car"
        // Expected output: false
        System.out.println(sol.isPalindrome("race a car"));

        // Test case 3: "Was it a car or a cat I saw?"
        // Expected output: true
        System.out.println(sol.isPalindrome("Was it a car or a cat I saw?"));

        // Test case 4: "Madam, in Eden, I'm Adam."
        // Expected output: true
        System.out.println(sol.isPalindrome("Madam, in Eden, I'm Adam."));

        // Test case 5: "empty string"
        // Expected output: true
        System.out.println(sol.isPalindrome(""));
    }
}
