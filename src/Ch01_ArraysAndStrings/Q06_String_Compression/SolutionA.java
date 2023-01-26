package Ch01_ArraysAndStrings.Q06_String_Compression;

public class SolutionA {

    public static String stringCompression(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) { // book solution, mine was not working
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String[] inputs = { "aabcccccaaa", "aa", "aab", "aaa",
                "aaaaaaaaaa",
                "aaaaaqqqqqwwwwweeeerfffddeeskvkjjjjfjlksmmmssskiuiiiaaaaaa" };

        for (String input : inputs) {
            System.out.println(input + ": " + stringCompression(input));
        }
    }
}
