package Ch01_ArraysAndStrings.Q05_One_Away;

import java.util.Hashtable;
import java.util.Set;

public class SolutionA {

    public static boolean isOneAway(String original, String edited) {
        if (original.length() == edited.length() || original.length() - 1 == edited.length()
                || original.length() == edited.length() + 1) {
            Hashtable<Character, Integer> hTable = new Hashtable<Character, Integer>();

            for (int i = 0; i < original.length(); i++) {
                hTable.put(original.charAt(i), 1);
            }

            for (int i = 0; i < edited.length(); i++) {
                if (hTable.containsKey(edited.charAt(i))) {
                    hTable.put(edited.charAt(i), hTable.get(edited.charAt(i)) + 1);
                } else {
                    hTable.put(edited.charAt(i), 1);
                }
            }

            Set<Character> keys = hTable.keySet();
            int differences = 0;
            for (Character key : keys) {
                if (hTable.get(key) % 2 != 0) {
                    differences++;
                }
                if (differences > 2) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String[][] inputs = {
                { "pale", "ple" },
                { "pales", "pale" },
                { "pale", "bale" },
                { "pale", "bake" },
                { "pale", "paaaaless" }
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println(
                    String.format("%s, %s -> ", inputs[i][0], inputs[i][1]) + isOneAway(inputs[i][0], inputs[i][1]));
        }
    }
}
