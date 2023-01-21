package Ch01_ArraysAndStrings;

public class MyStringBuilder {
    private int count = 0;
    private char[] value;

    public MyStringBuilder() {
        value = new char[16];
    }

    public MyStringBuilder(String str) {
        value = new char[str.length()];
        append(str);
    }

    public void append(char c) {
        ensureCapacityInternal();
        value[count++] = c;
    }

    public void append(String s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.charAt(i));
        }
    }

    public void reverse() {
        char[] reversed = new char[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = value[count - 1 - i];
        }
        value = reversed;
    }

    private void ensureCapacityInternal() {
        if (count + 1 == value.length) {
            char[] newValue = new char[value.length * 2];
            for (int i = 0; i < value.length; i++) {
                newValue[i] = value[i];
            }
            value = newValue;
        }
    }

    @Override
    public String toString() {
        return new String(value);
    }
}
