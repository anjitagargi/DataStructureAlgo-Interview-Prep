package DataStructureAlgo.islandPattern;

public class NumberOfIslands {

    public static int countIslands(int[][] matrix) {
        int totalIslands = 0;
        // TODO: Write your code here
        return totalIslands;
    }

    public static void main(String[] args) {
        NumberOfIslands Solution = new NumberOfIslands();
        System.out.println(Solution.countIslands(
                new int[][]{
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 1, 1},
                        {0, 1, 1, 1, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0}
                }));

        System.out.println(Solution.countIslands(
                new int[][]{
                        {1, 1, 1, 0, 0},
                        {0, 1, 0, 0, 1},
                        {0, 0, 1, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0}
                }));

    }

}
