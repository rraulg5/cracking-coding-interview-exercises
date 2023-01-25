package Ch01_ArraysAndStrings.Q01_Is_Unique;

import java.util.Hashtable;

public class SolutionA {

    public static boolean isUnique(String str) {
        Hashtable<Character, Integer> hashTable = new Hashtable<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hashTable.containsKey(str.charAt(i))) {
                return false;
            }
            hashTable.put(str.charAt(i), 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "aba", "programmer", "cat", "wolverine", "black", "hello", "world" };
        for (String s : words) {
            System.out.println(s + ": " + isUnique(s));
        }
    }
}
