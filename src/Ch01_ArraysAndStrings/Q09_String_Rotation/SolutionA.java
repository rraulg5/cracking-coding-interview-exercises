package Ch01_ArraysAndStrings.Q09_String_Rotation;

public class SolutionA {

    public static boolean isRotation(String s1, String s2, int splitPoint) {
        if (s1.length() != s2.length())
            return false;

        String x = s1.substring(0, splitPoint);
        String y = s1.substring(splitPoint - 1, s1.length());

        System.out.println(x);
        System.out.println(y);

        return isSubString(s2, x + y + x + y);
    }

    // mock method
    public static boolean isSubString(String s1, String s2) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat", 3));
    }
}
