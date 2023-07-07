package DataStructureAlgo.fastSlowPointer;

public class HappyNumbers {

    public static boolean find(int num) {
        // TODO: Write your code here
        int slow = num, fast = num;
        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }
    private static int findSquareSum(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumbers Solution = new HappyNumbers();
        System.out.println(Solution.find(23));
        System.out.println(Solution.find(12));
    }
}
