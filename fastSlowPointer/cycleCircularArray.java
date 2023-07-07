package DataStructureAlgo.fastSlowPointer;

public class cycleCircularArray {
    public static boolean loopExists(int[] arr) {
        // TODO: Write your code here
        

        return false;
    }

    public static void main(String[] args) {
        cycleCircularArray Solution = new cycleCircularArray();
        System.out.println(Solution.loopExists(new int[] { 1, 2, -1, 2, 2 }));
        System.out.println(Solution.loopExists(new int[] { 2, 2, -1, 2 }));
        System.out.println(Solution.loopExists(new int[] { 2, 1, -1, -2 }));
    }
}
