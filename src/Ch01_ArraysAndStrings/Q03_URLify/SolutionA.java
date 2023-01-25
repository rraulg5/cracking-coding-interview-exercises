package Ch01_ArraysAndStrings.Q03_URLify;

public class SolutionA {

    public static String URLify(String s, int length) {
        String sTrimmed = s.trim();

        if (length != sTrimmed.length()) {
            return "String length is not correct.";
        }

        int spaceCount = 0;
        // Count spaces
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        char[] strURL = new char[length - 1 + spaceCount * 3];

        // URLify string
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                strURL[i] = '%';
                strURL[i + 1] = '2';
                strURL[i + 2] = '0';
            } else {
                strURL[i] = s.charAt(i);
            }
        }

        return new String(strURL);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int length = 13;

        System.out.println(URLify(input, length));
    }
}
