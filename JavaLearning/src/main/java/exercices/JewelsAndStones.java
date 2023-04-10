package exercices;

public class JewelsAndStones {
    /*
You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A"

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 2
     */

    public static void main(String[] args) {
        String ruby = "aAAAAa";
        String stones = "bbbbbbaaA";
        System.out.println(totalCount(ruby, stones));
    }

    public static int totalCount(String jewels, String stones) {
        int jewelCount = countJewels(jewels) + countJewels(stones);
        return jewelCount;
    }

    public static int countJewels(String object) {
        char[] objectCharArray = object.toCharArray();
        int jewelCount = 0;
        for (char c : objectCharArray) {
            if (isThisAJewel(c)) {
                jewelCount += 1;
            }
        }
        return jewelCount;
    }

    private static boolean isThisAJewel(char c) {
        return String.valueOf(c).equals(String.valueOf(c).toUpperCase());
    }

}
