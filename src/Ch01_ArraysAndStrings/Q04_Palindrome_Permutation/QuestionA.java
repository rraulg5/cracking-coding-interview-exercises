package Ch01_ArraysAndStrings.Q04_Palindrome_Permutation;

import java.util.Hashtable;
import java.util.Set;

public class QuestionA {

    public static boolean isPermutation(String str) {
        str = str.toLowerCase();
        Hashtable<Character, Integer> hashTable = new Hashtable<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (hashTable.containsKey(str.charAt(i))) {
                    hashTable.put(str.charAt(i), hashTable.get(str.charAt(i)) + 1);
                } else {
                    hashTable.put(str.charAt(i), 1);
                }
            }
        }

        Set<Character> keys = hashTable.keySet();
        int oddLetters = 0;
        for (Character key : keys) {
            if (hashTable.get(key) % 2 != 0) {
                oddLetters++;
            }
            if (oddLetters > 1) { // oddLetters must be 0 or 1
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] options = { "Tact Coa", "FUO ufot", "bird bir", "Sir, I dewand, I am a maid named Iris",
                "Nover edd oe rven", "Inata vala al anti" };
        for (String option : options) {
            System.out.println(option + ": " + isPermutation(option));
        }
    }
}
