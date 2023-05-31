package DataStructureAlgo.warmup;

public class reverseString {

    public String reverseVowels(String s) {

        int first = 0, last = s.length() - 1; // Initialize the two pointers
        char[] array = s.toCharArray();
        while (first < last) {
            char temp = array[first]; // Swap the vowels found at first and last
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        return new String(array); // Return the reversed string
    }


    public static void main(String[] args) {
        reverseString solution = new reverseString();

        // Test Case 1
        String s1 = "hello";
        String expectedOutput1 = "olleh";
        String actualOutput1 = solution.reverseVowels(s1);
        System.out.println("Test Case 1: " + (expectedOutput1.equals(actualOutput1)));

        // Test Case 2
        String s2 = "DesignGUrus";
        String expectedOutput2 = "surUGngiseD";
        String actualOutput2 = solution.reverseVowels(s2);
        System.out.println("Test Case 2: " + (expectedOutput2.equals(actualOutput2)));

        // Test Case 3
        String s3 = "AEIOU";
        String expectedOutput3 = "UOIEA";
        String actualOutput3 = solution.reverseVowels(s3);
        System.out.println("Test Case 3: " + (expectedOutput3.equals(actualOutput3)));

        // Test Case 4
        String s4 = "aA";
        String expectedOutput4 = "Aa";
        String actualOutput4 = solution.reverseVowels(s4);
        System.out.println("Test Case 4: " + (expectedOutput4.equals(actualOutput4)));

        // Test Case 5
        String s5 = "";
        String expectedOutput5 = "";
        String actualOutput5 = solution.reverseVowels(s5);
        System.out.println("Test Case 5: " + (expectedOutput5.equals(actualOutput5)));
    }
}
