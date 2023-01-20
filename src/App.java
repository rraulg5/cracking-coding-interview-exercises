import ArraysAndStrings.MyArrayList;
import ArraysAndStrings.MyStringBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> integersList = new MyArrayList<Integer>();

        /* Check init state of the list */
        System.out.println("isEmpty: " + integersList.isEmpty());
        System.out.println("getSize: " + integersList.getSize());
        // System.out.println(list.get(5));
        // list.removeAt(0);

        /* Add elements */
        for (int i = 1; i <= 20; i++) {
            integersList.add(i);
        }

        System.out.println(integersList.toString());
        System.out.println("getSize: " + integersList.getSize());

        /* Remove elements */
        integersList.removeAt(10);
        integersList.removeAt(2);

        System.out.println(integersList.toString());
        System.out.println("getSize: " + integersList.getSize());

        /* Add elements */
        for (int i = 21; i <= 50; i++) {
            integersList.add(i);
        }

        /* Remove elements */
        integersList.removeAt(0);

        System.out.println(integersList.toString());
        System.out.println("getSize: " + integersList.getSize());

        MyArrayList<String> stringsList = new MyArrayList<String>();

        /* Check init state of the list */
        System.out.println("isEmpty: " + stringsList.isEmpty());
        System.out.println("getSize: " + stringsList.getSize());

        /* Add elements */

        stringsList.add("aaa");
        stringsList.add("bbb");
        stringsList.add("ccc");
        stringsList.add("ddd");

        System.out.println(stringsList.toString());
        System.out.println("getSize: " + stringsList.getSize());

        /* Remove elements */
        stringsList.removeAt(2);

        System.out.println(stringsList.toString());
        System.out.println("getSize: " + stringsList.getSize());
    }
}
