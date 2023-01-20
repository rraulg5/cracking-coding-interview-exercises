package ArraysAndStrings;

public class MyArrayList<T> {
    private int size = 0;
    private Object[] arrList;

    public MyArrayList() {
        arrList = new Object[16];
    }

    public MyArrayList(int initialCapacity) {
        arrList = new Object[initialCapacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        isValidIndex(index);
        return (T) arrList[index];
    }

    public void add(T item) {
        ensureCapacityInternal();
        arrList[size++] = item;
    }

    public void removeAt(int index) {
        isValidIndex(index);

        for (int i = index; i < size - 1; i++) {
            arrList[i] = arrList[i + 1];
        }
        size--;
    }

    private void isValidIndex(int index) {
        if (index < 0 || index > size || isEmpty())
            throw new ArrayIndexOutOfBoundsException();
    }

    private void ensureCapacityInternal() {
        if (size + 1 == arrList.length) {
            Object[] newArrList = new Object[arrList.length * 2];

            for (int i = 0; i < arrList.length; i++) {
                newArrList[i] = arrList[i];
            }

            arrList = newArrList;
        }
    }

    @Override
    public String toString() {
        MyStringBuilder strBuilder = new MyStringBuilder();

        strBuilder.append("[");
        for (int i = 0; i < size; i++) {
            strBuilder.append(arrList[i].toString());
            if (i + 1 != size) {
                strBuilder.append(", ");
            }
        }
        strBuilder.append("]");

        return strBuilder.toString();
    }
}
