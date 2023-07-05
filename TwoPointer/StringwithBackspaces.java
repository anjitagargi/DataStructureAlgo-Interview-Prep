package DataStructureAlgo.TwoPointer;

public class StringwithBackspaces {
    private static int getNextValidCharIndex(String str, int index){
        int backspaceCount = 0;
        while(index>= 0){
            if(str.charAt(index) == '#')
                backspaceCount++;
            else if (backspaceCount>0) {
                backspaceCount--;
            }
            else break;
            index--;
        }
        return index;
    }

    public static boolean compare(String str1, String str2) {
        // TODO: Write your code here
        int index1 = str1.length() - 1, index2 = str2.length() - 1;
        while(index1 >= 0 || index2 >= 0){

            int i1 = getNextValidCharIndex(str1, index1);
            int i2 = getNextValidCharIndex(str2, index2);

            if (i1 < 0 && i2 < 0)
                return true;
            if (i1 < 0 || i2 < 0)
                return false;
            if (str1.charAt(i1) != str2.charAt(i2))
                return false;

            index1 = i1 - 1;
            index2 = i2 - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        StringwithBackspaces Solution = new StringwithBackspaces();
        System.out.println(Solution.compare("xy#z", "xzz#"));
        System.out.println(Solution.compare("xy#z", "xyz#"));
        System.out.println(Solution.compare("xp#", "xyz##"));
        System.out.println(Solution.compare("xywrrmp", "xywrrmu#p"));

    }
}