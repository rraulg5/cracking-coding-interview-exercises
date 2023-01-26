package Ch01_ArraysAndStrings.Q02_Check_Permutation;

import java.util.Arrays;

public class SolutionA {

    private static String sort(String s) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        return new String(sArray);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean isPermutation = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + isPermutation);
        }
    }
}